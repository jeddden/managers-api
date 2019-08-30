package com.yunku.demo.core.interceptor;

import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.common.respons.ErrorResponseData;
import com.yunku.demo.config.properties.SessionProperties;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.tool.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.yunku.demo.common.constant.ResponseStatusEnum.*;

/**
 * Api接口鉴权
 *
 * @author Jeddden
 * @create 2019-08-15 11:42
 */
public class ApiInterceptor extends HandlerInterceptorAdapter {

    private final Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("======= 请求地址 =======>:path[{}] uri[{}]", request.getServletPath(), request.getRequestURI());
        //从请求头中获取用户token（登陆凭证根据业务而定）
        SessionProperties sessionProperties = SpringContextHolder.getBean(SessionProperties.class);
        String token = request.getHeader(sessionProperties.getKeyName());
        if (token == null || token.trim().isEmpty()) {
            RenderUtil.renderJson(response, new ErrorResponseData(NOT_MISSING_TOKEN));
            return false;
        }
//        System.out.println("====== token ======>:" + token);
        TokenUtils tokenUtils = SpringContextHolder.getBean(TokenUtils.class);
        try{
            SignUser signUser = tokenUtils.checkToken(token);
            MySubjectContext.put(signUser);
            tokenUtils.flushTokenExprie();
            return true;
        }catch (ServiceException e){
            RenderUtil.renderJson401(response, new ErrorResponseData(e.getCode(),e.getMessage(),e.getClass()));
            return false;
        }catch (Exception e){
            RenderUtil.renderJson401(response, new ErrorResponseData(500,e.getMessage(),e.getClass()));
            return false;
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
        TokenUtils.remove();
        MySubjectContext.remove();
    }


}
