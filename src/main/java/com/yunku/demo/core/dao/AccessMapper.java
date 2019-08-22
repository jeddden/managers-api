package com.yunku.demo.core.dao;

import com.yunku.demo.core.model.Access;
import com.yunku.demo.core.model.example.AccessExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AccessMapper继承基类
 */
@Mapper
public interface AccessMapper extends MyBatisBaseDao<Access, Short, AccessExample> {

    List<Access> selectByUserId(@Param("userId") String userId);

    // 得到自身以及子资源id
    List<Long> getAllIdentifier(@Param("id") Long id);
}