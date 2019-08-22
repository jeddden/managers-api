package com.yunku.demo.core.dao;

import com.yunku.demo.core.model.User;
import com.yunku.demo.core.model.example.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper继承基类
 */
@Mapper
public interface UserMapper extends MyBatisBaseDao<User, Short, UserExample> {
    User seekByAccount(@Param("account") String account);

    User getByOpenid(@Param("openid") String openid);
}