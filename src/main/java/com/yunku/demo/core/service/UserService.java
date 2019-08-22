package com.yunku.demo.core.service;

/**
 * @author Jeddden
 * @create 2019-08-15 16:43
 */
public interface UserService {

    // 记录openid
    int recordOpenId(Short id,String openid);

    int cleanOpenId(Short id);

}
