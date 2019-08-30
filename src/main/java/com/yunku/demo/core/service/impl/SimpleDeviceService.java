package com.yunku.demo.core.service.impl;

import com.yunku.demo.core.dao.DeviceMapper;
import com.yunku.demo.core.model.Device;
import com.yunku.demo.core.service.DeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jeddden
 * @create 2019-08-20 17:14
 */
@Service
public class SimpleDeviceService implements DeviceService {
    @Resource
    private DeviceMapper deviceMapper;

    @Override
    public Device fetchById(Integer id) {
        return deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public Device fetchByCode(String deviceCode) {
        return deviceMapper.selectDeviceByCode(deviceCode);
    }
}
