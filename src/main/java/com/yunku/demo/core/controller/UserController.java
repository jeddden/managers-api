package com.yunku.demo.core.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yunku.demo.common.Json;
import com.yunku.demo.common.baseclass.MyBaseController;
import com.yunku.demo.common.respons.ResponseResult;
import com.yunku.demo.config.WechatAccountConfig;
import com.yunku.demo.core.model.MiniOauth2Token;
import com.yunku.demo.tool.NetUtil;
import com.yunku.demo.tool.RedisUtils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Scope("prototype")
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController extends MyBaseController {

	@Autowired
	RedisUtils redisUtils;

	@Autowired
	WechatAccountConfig wechatAccountConfig;

	@ApiModel
	class User {
		@ApiModelProperty(value = "用户id号")
		public Long id;

		@ApiModelProperty(value = "用户名")
		public String name;

		@ApiModelProperty(value = "权限集：1，生产人员；2，设备维护人员")
		public Long[] roles;

		@ApiModelProperty(value = "登录成功以后的session。在后续的登录中，必须在cookie中带有loginSessionId=XXX")
		public String sessionId;
	}

	@RequestMapping("/login")
	@ApiResponses(value = {
			@ApiResponse(code = 500, message = "系统错误"),
			@ApiResponse(code = 200, message = "操作成功")
	})
	@ApiOperation(httpMethod = "POST", value = "用户登录", notes = "true表示正确登录；false表示登录失败，失败原因在msg里面")
	@ApiImplicitParams({
			@ApiImplicitParam(name="loginname",value="登录用户名",required=true,paramType="form"),
			@ApiImplicitParam(name="password",value="密码",required=true,paramType="form"),
			@ApiImplicitParam(name="code",value="微信登录code",required=true,paramType="form")
	})
	public ResponseResult<User> login(String loginname,String password,String code) {


		return null;
	}

	@RequestMapping("/wxappLoginAgain")
	@ApiResponses(value = {
			@ApiResponse(code = 500, message = "系统错误"),
			@ApiResponse(code = 200, message = "操作成功")
	})
	@ApiOperation(httpMethod = "POST", value = "用户自动登录", notes = "true表示正确登录；false表示登录失败，用户没有绑定后台账户，需要重新使用账户、密码登录")
	@ApiImplicitParams({
			@ApiImplicitParam(name="code",value="微信登录code",required=true,paramType="form")
	})
	public Object wxappLoginAgain(@RequestParam(required = true) String code) {
		MiniOauth2Token miniOauth2Token = this.wxlogin(code);
		if (miniOauth2Token == null) {
			return this.renderError("no miniOauth2Token");
		}
		return miniOauth2Token;
	}

	@RequestMapping("/logout")
	@ApiResponses(value = {
			@ApiResponse(code = 500, message = "系统错误"),
			@ApiResponse(code = 200, message = "操作成功")
	})
	@ApiOperation(httpMethod = "POST", value = "用户退出登录")
	@ApiImplicitParams({
	})
	public Json<User> logout(HttpServletRequest request) {
		return null;
	}


	private MiniOauth2Token wxlogin(String code){
		String requestUrl =
				"https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
		requestUrl = requestUrl.replace("APPID", wechatAccountConfig.getMiniAppId())
				.replace("SECRET", wechatAccountConfig.getMiniAppSecret())
				.replace("JSCODE", code);
		try {
			JSONObject jsonObject = JSON.parseObject(NetUtil.get(requestUrl));
			if (jsonObject == null) {
				new RuntimeException("微信访问出错。");
			}
			MiniOauth2Token mtoken = new MiniOauth2Token();
			mtoken.setErrcode(jsonObject.getInteger("errcode"));
			mtoken.setErrmsg(jsonObject.getString("errmsg"));
			mtoken.setOpenid(jsonObject.getString("openid"));
			mtoken.setSessionKey(jsonObject.getString("session_key"));
			mtoken.setUnionid(jsonObject.getString("unionid"));
			if (mtoken.getErrcode() != 0){
				new RuntimeException(mtoken.getErrmsg());
			}
			return mtoken;
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw e;
		}
	}


}
