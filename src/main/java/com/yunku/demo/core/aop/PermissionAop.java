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

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 权限检查的aop
 *
 * @author fengshuonan
 * @date 2017-07-13 21:05
 */
@Aspect
@Component
@Order(200)
public class PermissionAop {

//    @Autowired
//    private PermissiondCheckService check;
//
//    @Pointcut(value = "@annotation(cn.stylefeng.guns.core.common.annotion.Permission)")
//    private void cutPermission() {
//
//    }
//
//    @Around("cutPermission()")
//    public Object doPermission(ProceedingJoinPoint point) throws Throwable {
//        MethodSignature ms = (MethodSignature) point.getSignature();
//        Method method = ms.getMethod();
//        Permission permission = method.getAnnotation(Permission.class);
//        Object[] permissions = permission.value();
//        if (permissions.length == 0) {
//
//            //检查全体角色
//            boolean result = check.checkAll();
//            if (result) {
//                return point.proceed();
//            } else {
//                throw new NoPermissionException();
//            }
//
//        } else {
//
//            //检查指定角色
//            boolean result = check.check(permissions);
//            if (result) {
//                return point.proceed();
//            } else {
//                throw new NoPermissionException();
//            }
//        }
//    }

}
