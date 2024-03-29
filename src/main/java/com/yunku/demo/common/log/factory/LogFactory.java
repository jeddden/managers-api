/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yunku.demo.common.log.factory;

import com.yunku.demo.common.constant.state.LogSucceed;
import com.yunku.demo.common.constant.state.LogType;
import com.yunku.demo.core.model.DeviceOperatingLog;
import com.yunku.demo.core.model.LoginLog;
import com.yunku.demo.core.model.OperationLog;

import java.util.Date;

/**
 * 日志对象创建工厂
 *
 * @author fengshuonan
 * @date 2016年12月6日 下午9:18:27
 */
public class LogFactory {

    /**
     * 创建设备操作日志
     */
    public static DeviceOperatingLog createDeviceOperationLog(Long deviceId, String deviceCode,Byte port,Integer userId,String userName, String operation, String location, String methodName, String message, LogSucceed succeed) {
        DeviceOperatingLog deviceOperatingLog = new DeviceOperatingLog();
        deviceOperatingLog.setCreateTime(new Date());
        deviceOperatingLog.setDeviceCode(deviceCode);
        deviceOperatingLog.setDeviceId(deviceId);
        deviceOperatingLog.setLocation(location);
        deviceOperatingLog.setMessage(message);
        deviceOperatingLog.setMethod(methodName);
        deviceOperatingLog.setOperation(operation);
        deviceOperatingLog.setPort(port);
        deviceOperatingLog.setOperatorId(userId);
        deviceOperatingLog.setOperatorName(userName);
        deviceOperatingLog.setSecceed(succeed.getMessage());
        return deviceOperatingLog;
    }

    /**
     * 创建操作日志
     */
    public static OperationLog createOperationLog(LogType logType, Long userId, String bussinessName, String clazzName, String methodName, String msg, LogSucceed succeed) {
        DeviceOperatingLog deviceOperatingLog = new DeviceOperatingLog();

        OperationLog operationLog = new OperationLog();
        operationLog.setLogType(logType.getMessage());
        operationLog.setLogName(bussinessName);
        operationLog.setUserId(userId);
        operationLog.setClassName(clazzName);
        operationLog.setMethod(methodName);
        operationLog.setCreateTime(new Date());
        operationLog.setSucceed(succeed.getMessage());
        operationLog.setMessage(msg);
        return operationLog;
    }

    /**
     * 创建登录日志
     */
    public static LoginLog createLoginLog(LogType logType, Long userId, String msg, String ip) {
        LoginLog loginLog = new LoginLog();
        loginLog.setLogName(logType.getMessage());
        loginLog.setUserId(userId);
        loginLog.setCreateTime(new Date());
        loginLog.setSucceed(LogSucceed.SUCCESS.getMessage());
        loginLog.setIpAddress(ip);
        loginLog.setMessage(msg);
        return loginLog;
    }


}
