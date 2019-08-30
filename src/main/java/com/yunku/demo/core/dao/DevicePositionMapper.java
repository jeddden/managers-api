package com.yunku.demo.core.dao;

import com.yunku.demo.core.model.DevicePosition;
import com.yunku.demo.core.model.example.DevicePositionExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * DevicePositionMapper继承基类
 */
@Mapper
public interface DevicePositionMapper extends MyBatisBaseDao<DevicePosition, Long, DevicePositionExample> {
}