package com.yunku.demo.core.dao;

import com.yunku.demo.common.baseclass.MyBatisBaseDao;
import com.yunku.demo.core.model.User;
import com.yunku.demo.core.model.example.UserExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper继承基类
 */
@Mapper
public interface UserMapper extends MyBatisBaseDao<User, Short, UserExample> {
}