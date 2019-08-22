package com.yunku.demo.core.service;

import com.yunku.demo.core.model.Device;

/**
 * 设备信息
 *
 * @author Jeddden
 * @create 2019-08-20 17:12
 */
public interface DeviceService {

    Device fetchById(Integer id);
}
