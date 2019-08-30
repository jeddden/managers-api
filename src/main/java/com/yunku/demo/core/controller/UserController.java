package com.yunku.demo.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yunku.demo.common.Json;
import com.yunku.demo.common.baseclass.MyBaseController;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.common.respons.ResponseData;
import com.yunku.demo.config.WechatAccountConfig;
import com.yunku.demo.core.model.MiniOauth2Token;
import com.yunku.demo.core.model.MiniUser;
import com.yunku.demo.core.service.DeviceService;
import com.yunku.demo.core.service.UserService;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.core.subject.Subject;
import com.yunku.demo.tool.MySubjectContext;
import com.yunku.demo.tool.NetUtil;
import com.yunku.demo.tool.TokenUtils;
import io.swagger.annotations.*;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static com.yunku.demo.common.constant.ResponseStatusEnum.WECHAT_SERVICE_FAILURE;

@RestController
@Scope("prototype")
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController extends MyBaseController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    WechatAccountConfig wechatAccountConfig;

    @Autowired
    TokenUtils tokenUtils;

    @Autowired
    UserService userService;

    @Autowired
    Subject subject;

    @Autowired
    DeviceService deviceService;

    @ApiModel
    class User {
        @ApiModelProperty(value = "用户id号")
        public Long id;

        @ApiModelProperty(value = "用户名")
        public String name;

        @ApiModelProperty(value = "权限集：1，生产人员；2，设备维护人员")
        public Long[] roles;

        @ApiModelProperty(value = "登录成功以后的session。在后续的登录中，必须在cookie中带有loginSessionId=XXX")
        public String sessionKey;
    }

    @RequestMapping("/index")
    @ApiOperation(httpMethod = "GET", value = "用户首页")
    @ApiResponses(value = {
            @ApiResponse(code = 401, message = "没有经过验证的权限"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    public ResponseData<SignUser> index() {
        return this.renderSuccess(getSignUser());
    }

    @RequestMapping("/logintest")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "用户登录", notes = "true表示正确登录；false表示登录失败，失败原因在msg里面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loginname", value = "登录用户名", required = true),
            @ApiImplicitParam(name = "password", value = "密码", required = true),
            @ApiImplicitParam(name = "code", value = "微信登录code", required = false)
    })
    public ResponseData<SignUser> logintest(@RequestParam(value = "loginname", required = true) String loginname
            , @RequestParam(value = "password", required = true) String password
            , @RequestParam(value = "code", required = false) String code) {
        SignUser signUser = subject.login(loginname, password);
        try {
            tokenUtils.putIn(signUser);
            return this.renderSuccess(signUser);
        } finally {
            if (!StringUtils.isEmpty(code)) {
                new Thread(() -> {
                    MiniOauth2Token miniOauth2Token = this.wxlogin(code);
                    if (miniOauth2Token.getErrcode() == 0) {
                        userService.recordOpenId(signUser.getId(), miniOauth2Token.getOpenid());
                    }
                    logger.error(miniOauth2Token.toString());
                }).start();
            }
        }


    }

    @RequestMapping("/login")
    @ApiOperation(httpMethod = "POST", value = "用户登录", notes = "true表示正确登录；false表示登录失败，失败原因在msg里面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loginname", value = "登录用户名", required = true, paramType = "form"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "form"),
            @ApiImplicitParam(name = "code", value = "微信登录code", required = true, paramType = "form")
    })
    public ResponseData<SignUser> login(@RequestBody MiniUser user) {
        if (StringUtils.isEmpty(user.getLoginname()) || StringUtils.isEmpty(user.getPassword())) {
            return this.renderError("用户名或密码不能为空。");
        }
        SignUser signUser = subject.login(user.getLoginname(), user.getPassword());
        try {
            tokenUtils.putIn(signUser);
            return this.renderSuccess(signUser);
        } finally {
            if (!StringUtils.isEmpty(user.getCode())) {
                new Thread(() -> {
                    MiniOauth2Token miniOauth2Token = this.wxlogin(user.getCode());
                    int result = userService.recordOpenId(signUser.getId(), miniOauth2Token.getOpenid());
                    if (result > 0) {
                        logger.info("用户id:" + signUser.getId() + " 登记openid:" + miniOauth2Token.getOpenid());
                    }
                }).start();
            }
        }
    }


    @RequestMapping("/wxappLoginAgain")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "用户自动登录", notes = "true表示正确登录；false表示登录失败，用户没有绑定后台账户，需要重新使用账户、密码登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "微信登录code", required = true)
    })
    public ResponseData<SignUser> wxappLoginAgain(@RequestBody MiniUser user) {
        String code = user.getCode();
        if (StringUtils.isEmpty(code)) {
            return this.renderError("not missing code.");
        }
        MiniOauth2Token miniOauth2Token = this.wxlogin(code);
        SignUser signUser = subject.login(miniOauth2Token.getOpenid());
        if (signUser == null) {
            return this.renderSuccessFalse("没有登记openid");
        }
        tokenUtils.putIn(signUser);
        return this.renderSuccess(signUser);

    }

    @RequestMapping("/logout")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "用户退出登录")
    @ApiImplicitParams({
    })
    public ResponseData logout() {
        tokenUtils.removeToken();
        int result = userService.cleanOpenId(this.getSignUser().getId());
        if (result > 0) {
            return renderSuccess();
        }
        return renderError("注销失败！");
    }

    @RequestMapping("/test")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "test")
    @ApiImplicitParams({
    })
    public Json<User> test( HttpServletRequest request) {
        try {
            SignUser user = MySubjectContext.get();
            logger.info("test context===>" + user.toString());
            request.setAttribute("device",user);
            deviceService.fetchById(5855);
//            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private final MiniOauth2Token wxlogin(String code) {
        String requestUrl;
        requestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
        requestUrl = requestUrl.replace("APPID", wechatAccountConfig.getMiniAppId())
                .replace("SECRET", wechatAccountConfig.getMiniAppSecret())
                .replace("JSCODE", code);
        try {
            String jobj = NetUtil.get(requestUrl);
            logger.info("====== wexin net ======>" + jobj);
            JSONObject jsonObject = JSON.parseObject(jobj);
            if (jsonObject == null) {
                throw new ServiceException(WECHAT_SERVICE_FAILURE);
            }
            MiniOauth2Token mtoken = new MiniOauth2Token();
            mtoken.setErrcode(jsonObject.getInteger("errcode"));
            mtoken.setErrmsg(jsonObject.getString("errmsg"));
            mtoken.setOpenid(jsonObject.getString("openid"));
            mtoken.setSessionKey(jsonObject.getString("session_key"));
            mtoken.setUnionid(jsonObject.getString("unionid"));
            if (!StringUtils.isEmpty(mtoken.getErrmsg())) {
                logger.error("== wechat error ==>: errcode :" + mtoken.getErrcode() + " message :" + mtoken.getErrmsg());
                throw new ServiceException(WECHAT_SERVICE_FAILURE);
            }
            return mtoken;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }


}
