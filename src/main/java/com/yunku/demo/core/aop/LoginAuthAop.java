package com.yunku.demo.core.aop;

import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.core.subject.Subject;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 登陆认证
 *
 * @author Jeddden
 * @create 2019-08-18 15:01
 */

@Aspect
@Component
public class LoginAuthAop {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Subject subject;

    @Pointcut(value = "execution(* com.yunku.demo.core.subject.Subject.login(..))")
    private void pointcut() { }

    @AfterReturning(pointcut = "pointcut()",returning = "returnVal")
    public void AfterReturning(Object returnVal){
        if (returnVal != null) {
            SignUser signUser = ((SignUser) returnVal);
            subject.checkLoginAuthentication(signUser);
        }
    }
}
