package com.yunku.demo.core.service;

import com.yunku.demo.core.dao.DeviceOperatingLogMapper;
import com.yunku.demo.core.model.DeviceOperatingLog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 操作日志服务
 *
 * @author Jeddden
 * @create 2019-08-25 12:14
 */
@Service
public class DeviceOperatingLogService {

    @Resource
    private DeviceOperatingLogMapper deviceOperatingLogMapper;

    public List<DeviceOperatingLog> selectByUserId(Integer userId){
        return deviceOperatingLogMapper.selectTemHistoryByUserId(userId);
    }

}
