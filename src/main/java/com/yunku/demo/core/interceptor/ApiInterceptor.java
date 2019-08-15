package com.yunku.demo.core.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Api接口鉴权
 *
 * @author Jeddden
 * @create 2019-08-15 11:42
 */
public class ApiInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(" -----------------------进入 api 拦截器 ----------------------------");
        HttpSession session = request.getSession(false);
        System.out.println("http session is " + session);


        return super.preHandle(request, response, handler);
    }
}
