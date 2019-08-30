/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yunku.demo.core.aop;

import com.yunku.demo.common.exception.AuthenticationException;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.common.respons.ErrorResponseData;
import com.yunku.demo.common.respons.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局的的异常拦截器（拦截所有的控制器）（带有@RequestMapping注解的方法上都会拦截）
 *
 * @author fengshuonan
 * @date 2016年11月12日 下午3:19:56
 */
@RestControllerAdvice
@Order(-1)
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 拦截业务异常
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ErrorResponseData bussiness(ServiceException e) {
//        LogManager.me().executeLog(LogTaskFactory.exceptionLog(ShiroKit.getUser().getId(), e));
//        getRequest().setAttribute("tip", e.getMessage());
        log.error("业务异常:", e);
        return new ErrorResponseData(e.getCode(), e.getMessage());
    }

    /**
     * 用户未登录异常
     */
//    @ExceptionHandler(AuthenticationException.class)
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public String unAuth(AuthenticationException e) {
//        log.error("用户未登陆：", e);
//        return "/login.html";
//    }

    /**
     * 账号被冻结异常
     */
//    @ExceptionHandler(DisabledAccountException.class)
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public String accountLocked(DisabledAccountException e, Model model) {
//        String username = getRequest().getParameter("username");
//        LogManager.me().executeLog(LogTaskFactory.loginLog(username, "账号被冻结", getIp()));
//        model.addAttribute("tips", "账号被冻结");
//        return "/login.html";
//    }

    /**
     * 权限错误异常
     */
    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public ResponseData authentication(AuthenticationException e) {
//        String username = HttpContext.getRequest().getParameter("username");
//        LogManager.me().executeLog(LogTaskFactory.loginLog(username, "账号密码错误", getIp()));
        log.debug("权限异常:", e);
        return new ErrorResponseData(e.getCode(), e.getMessage());
    }

    /**
     * 验证码错误异常
     */
//    @ExceptionHandler(InvalidKaptchaException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public String credentials(InvalidKaptchaException e, Model model) {
//        String username = getRequest().getParameter("username");
//        LogManager.me().executeLog(LogTaskFactory.loginLog(username, "验证码错误", getIp()));
//        model.addAttribute("tips", "验证码错误");
//        return "/login.html";
//    }

    /**
     * 无权访问该资源异常
     */
//    @ExceptionHandler(UndeclaredThrowableException.class)
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ResponseBody
//    public ErrorResponseData credentials(UndeclaredThrowableException e) {
//        getRequest().setAttribute("tip", "权限异常");
//        log.error("权限异常!", e);
//        return new ErrorResponseData(CoreExceptionEnum.NO_PERMITION.getCode(), CoreExceptionEnum.NO_PERMITION.getMessage());
//    }

    /**
     * 拦截未知的运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponseData notFount(RuntimeException e) {
//        LogManager.me().executeLog(LogTaskFactory.exceptionLog(ShiroKit.getUser().getId(), e));
//        getRequest().setAttribute("tip", "服务器未知运行时异常");
        log.error("运行时异常:", e);
        return new ErrorResponseData(500, e.getMessage());
    }
}
