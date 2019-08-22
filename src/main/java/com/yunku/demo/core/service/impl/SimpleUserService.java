package com.yunku.demo.core.service.impl;

import com.yunku.demo.core.dao.AccessMapper;
import com.yunku.demo.core.dao.RoleMapper;
import com.yunku.demo.core.dao.UserMapper;
import com.yunku.demo.core.model.User;
import com.yunku.demo.core.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jeddden
 * @create 2019-08-16 16:00
 */
@Service
public class SimpleUserService implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private AccessMapper accessMapper;


    @Override
    public int recordOpenId(Short id, String openid) {
        User user = new User();
        user.setId(id);
        user.setOpenid(openid);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int cleanOpenId(Short id) {
        User user = new User();
        user.setId(id);
        user.setOpenid("");
        return userMapper.updateByPrimaryKeySelective(user);
    }

}
