package com.yunku.demo.core.dao;

import com.yunku.demo.core.model.DeviceOperatingLog;
import com.yunku.demo.core.model.example.DeviceOperatingLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * DeviceOperatingLogMapper继承基类
 */
@Mapper
public interface DeviceOperatingLogMapper extends MyBatisBaseDao<DeviceOperatingLog, Long, DeviceOperatingLogExample> {

    List<DeviceOperatingLog> selectTemHistoryByUserId(@Param("userId") int userId);
}