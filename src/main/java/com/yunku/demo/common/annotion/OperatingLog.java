package com.yunku.demo.common.annotion;

import java.lang.annotation.*;

/**
 * @author Jeddden
 * @create 2019-08-23 15:14
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface OperatingLog {

    /**
     * 业务的名称,例如:"修改菜单"
     */
    String value() default "";


    /**
     * 被操作的设备端口号 0表示没有端口数据
     * @return
     */
    boolean port() default true;
}
