package com.yunku.demo.core.dao;

import com.yunku.demo.core.model.Device;
import com.yunku.demo.core.model.example.DeviceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * DeviceMapper继承基类
 */
@Mapper
public interface DeviceMapper extends MyBatisBaseDao<Device, Integer, DeviceExample> {

    Device selectDeviceByCode(@Param("deviceCode") String deviceCode);
}