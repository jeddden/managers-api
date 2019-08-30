package com.yunku.demo.core.dao;

import com.yunku.demo.core.model.Agent;
import com.yunku.demo.core.model.example.AgentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AgentMapper继承基类
 */
@Mapper
public interface AgentMapper extends MyBatisBaseDao<Agent, Integer, AgentExample> {

    // 查询所有旗下的商户
    List<Agent> selectAgentsById(@Param("id") Integer id);
}