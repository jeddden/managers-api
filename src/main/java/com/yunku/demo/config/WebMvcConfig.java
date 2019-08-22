package com.yunku.demo.config;

import com.yunku.demo.common.xss.XssFilter;
import com.yunku.demo.config.properties.SessionProperties;
import com.yunku.demo.core.ConfigListener;
import com.yunku.demo.core.interceptor.ApiInterceptor;
import com.yunku.demo.tool.AESUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

/**
 * @author Jeddden
 * @create 2019-06-12 16:13
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    /**
     * 增加对rest api鉴权的spring mvc拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ApiInterceptor()).addPathPatterns("/**");
        LinkedList linkedList = new LinkedList();
        linkedList.add("/user/login");
        linkedList.add("/user/logintest");
        linkedList.add("/user/wxappLoginAgain");
        linkedList.add("/error");
        linkedList.add("/webjars/**");
        linkedList.add("/swagger-ui.html/**");
        linkedList.add("/swagger-resources/**");
        registry.addInterceptor(new ApiInterceptor()).excludePathPatterns(linkedList).addPathPatterns("/**");
    }


    /**
     * xssFilter注册
     */
    @Bean
    public FilterRegistrationBean xssFilterRegistration() {
        XssFilter xssFilter = new XssFilter();
        // 这里可以加不被xss过滤的接口
        // xssFilter.setUrlExclusion(Arrays.asList("/notice/update", "/notice/add"));
        FilterRegistrationBean registration = new FilterRegistrationBean(xssFilter);
        registration.addUrlPatterns("/*");
        return registration;
    }

    /**
     * RequestContextListener注册
     */
    @Bean
    public ServletListenerRegistrationBean<RequestContextListener> requestContextListenerRegistration() {
        return new ServletListenerRegistrationBean<>(new RequestContextListener());
    }

    /**
     * ConfigListener注册
     */
    @Bean
    public ServletListenerRegistrationBean<ConfigListener> configListenerRegistration() {
        return new ServletListenerRegistrationBean<>(new ConfigListener());
    }

    @Bean
    @ConfigurationProperties(prefix = "zsession",ignoreInvalidFields = true)
    public SessionProperties getSessionProperties(){
        return new SessionProperties();
    }

    @Bean
    public AESUtil getAESUtil() throws NoSuchAlgorithmException {
       return new AESUtil();
    }
}
