package com.yunku.demo.core.dao;

import com.yunku.demo.common.baseclass.MyBatisBaseDao;
import com.yunku.demo.core.model.Role;
import com.yunku.demo.core.model.example.RoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper  extends MyBatisBaseDao<Role,Short,RoleExample> {

    List<Role> selectByUserId(@Param("userId") String userId);

}