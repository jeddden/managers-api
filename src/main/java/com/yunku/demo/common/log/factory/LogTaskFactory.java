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
import com.yunku.demo.common.log.LogManager;
import com.yunku.demo.core.dao.DeviceOperatingLogMapper;
import com.yunku.demo.core.model.DeviceOperatingLog;
import com.yunku.demo.core.model.LoginLog;
import com.yunku.demo.core.model.OperationLog;
import com.yunku.demo.tool.SpringContextHolder;
import com.yunku.demo.tool.util.ToolUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TimerTask;

/**
 * 日志操作任务创建工厂
 *
 * @author fengshuonan
 * @date 2016年12月6日 下午9:18:27
 */
public class LogTaskFactory {

    private static Logger logger = LoggerFactory.getLogger(LogManager.class);
//    private static LoginLogMapper loginLogMapper = SpringContextHolder.getBean(LoginLogMapper.class);
//    private static OperationLogMapper operationLogMapper = SpringContextHolder.getBean(OperationLogMapper.class);
    private static DeviceOperatingLogMapper deviceOperatingMapper = SpringContextHolder.getBean(DeviceOperatingLogMapper.class);
//    private static DevicePositionMapper devicePositionMapper = SpringContextHolder.getBean(DevicePositionMapper.class);

    public static TimerTask loginLog(final Long userId, final String ip) {
        return new TimerTask() {
            @Override
            public void run() {
                try {
                    LoginLog loginLog = LogFactory.createLoginLog(LogType.LOGIN, userId, null, ip);
//                    loginLogMapper.insert(loginLog);
                } catch (Exception e) {
                    logger.error("创建登录日志异常!", e);
                }
            }
        };
    }

    public static TimerTask loginLog(final String username, final String msg, final String ip) {
        return new TimerTask() {
            @Override
            public void run() {
                LoginLog loginLog = LogFactory.createLoginLog(
                        LogType.LOGIN_FAIL, null, "账号:" + username + "," + msg, ip);
                try {
//                    loginLogMapper.insert(loginLog);
                } catch (Exception e) {
                    logger.error("创建登录失败异常!", e);
                }
            }
        };
    }

    public static TimerTask exitLog(final Long userId, final String ip) {
        return new TimerTask() {
            @Override
            public void run() {
                LoginLog loginLog = LogFactory.createLoginLog(LogType.EXIT, userId, null, ip);
                try {
//                    loginLogMapper.insert(loginLog);
                } catch (Exception e) {
                    logger.error("创建退出日志异常!", e);
                }
            }
        };
    }

    public static TimerTask bussinessLog(final Long userId, final String bussinessName, final String clazzName, final String methodName, final String msg) {
        return new TimerTask() {
            @Override
            public void run() {
                OperationLog operationLog = LogFactory.createOperationLog(
                        LogType.BUSSINESS, userId, bussinessName, clazzName, methodName, msg, LogSucceed.SUCCESS);
                try {
//                    operationLogMapper.insert(operationLog);
                } catch (Exception e) {
                    logger.error("创建业务日志异常!", e);
                }
            }
        };
    }

    public static TimerTask exceptionLog(final Long userId, final Exception exception) {
        return new TimerTask() {
            @Override
            public void run() {
                String msg = ToolUtil.getExceptionMsg(exception);
                OperationLog operationLog = LogFactory.createOperationLog(
                        LogType.EXCEPTION, userId, "", null, null, msg, LogSucceed.FAIL);
                try {
//                    operationLogMapper.insert(operationLog);
                } catch (Exception e) {
                    logger.error("创建异常日志异常!", e);
                }
            }
        };
    }

    public static TimerTask deviceOperatingLog(final Integer deviceId,final String deviceCode,final String location,final Byte port,final Integer userId,final String userName,final String operation,final String methodName,final String message) {
        return new TimerTask() {
            @Override
            public void run() {
                DeviceOperatingLog deviceOperatingLog = LogFactory.createDeviceOperationLog(
                         deviceId.longValue(), deviceCode, port
                        , userId, userName,  operation,  location, methodName
                        ,  message, LogSucceed.SUCCESS);
                try {
                    deviceOperatingMapper.insertSelective(deviceOperatingLog);
                } catch (Exception e) {
                    logger.error("记录设备日志异常!", e);
                }
            }
        };
    }
}
