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
package com.yunku.demo.core.aop;

import com.yunku.demo.common.annotion.OperatingLog;
import com.yunku.demo.common.exception.AuthenticationException;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.common.log.LogManager;
import com.yunku.demo.common.log.factory.LogTaskFactory;
import com.yunku.demo.core.model.Device;
import com.yunku.demo.core.service.DeviceService;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.tool.HttpContext;
import com.yunku.demo.tool.MySubjectContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static com.yunku.demo.common.constant.ResponseStatusEnum.OUT_OF_DATA_SCOPE;
import static com.yunku.demo.common.constant.ResponseStatusEnum.REQUESTED_RESOURCE_NOT_EXIST;

/**
 * 设备操作管理AOP
 *
 * @author fengshuonan
 * @date 2016年12月6日 下午8:48:30
 */
@Aspect
@Component
public class DeviceContorlManageAop {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DeviceService deviceService;

    @Pointcut(value = "execution(* com.yunku.demo.core.service.IotService.*(String))&& args(deviceCode)")
    public void cutService(String deviceCode) {
    }

    @Pointcut(value = "execution(* com.yunku.demo.core.service.IotService.*(String,int))&& args(deviceCode,port)")
    public void cutService2(String deviceCode, int port) {
    }

    @Around("cutService2(deviceCode,port)")
    public Object deviceCotorlManage(ProceedingJoinPoint point, String deviceCode, int port) throws Exception {
        return handle(point, deviceCode, port);
    }

    @Around("cutService(deviceCode)")
    public Object deviceCotorlManage(ProceedingJoinPoint point, String deviceCode) throws Throwable {
        return handle(point, deviceCode);
    }

    private boolean isManufacturer(SignUser user) {
        return user.getAgentId() == null ? false : user.getAgentId() == 0;
    }

    private SignUser getSignUser() {
        return MySubjectContext.get();
    }

    private Object handle(ProceedingJoinPoint point, String deviceCode, int port) {
        log.info("< ================== handle ================== >");

        SignUser signUser = getSignUser();
        Device device = deviceService.fetchByCode(deviceCode);

        if (device == null) {
            throw new ServiceException(REQUESTED_RESOURCE_NOT_EXIST);
        }

        this.checkDeviceManageScope(device, signUser);
        //执行业务
        Object result = null;
        HttpContext.getRequest().setAttribute("device",device);
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            log.error("设备服务连接失败", throwable);
        }
        //记录操作日志
        try {
            recordOperationLog(point, port, signUser, device, result);
        } catch (Exception e) {
            log.error("日志记录出错!", e);
        }
        return result;
    }

    private Object handle(ProceedingJoinPoint point, String deviceCode) {
        log.info("< ================== read handle ================== >");
        SignUser signUser = getSignUser();
        Device device = deviceService.fetchByCode(deviceCode);
        if (device == null) {
            throw new ServiceException(REQUESTED_RESOURCE_NOT_EXIST);
        }
        this.checkDeviceManageScope(device, signUser);
        //执行业务
        Object result = null;
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            log.error("设备服务连接失败", throwable);
        }
        //记录操作日志
//        try {
//            recordOperationLog(point, port, signUser, device, result);
//        } catch (Exception e) {
//            log.error("日志记录出错!", e);
//        }
        return result;
    }

    private void recordOperationLog(ProceedingJoinPoint point, int port, SignUser signUser, Device device, Object result) throws NoSuchMethodException {
        log.info("< =============== operation log ================== >");
        Signature sig = point.getSignature();
        MethodSignature msig = (MethodSignature) sig;

        Object target = point.getTarget();
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
        String methodName = sig.getName();

        OperatingLog annotation = currentMethod.getAnnotation(OperatingLog.class);
        String bussinessName = annotation == null ? methodName : annotation.value();


        LogManager.me().executeLog(LogTaskFactory.deviceOperatingLog(device.getId(), device.getDeviceCode(), device.getLocation(), (byte) port, signUser.getId().intValue(), signUser.getName(), bussinessName, methodName, result.toString()));
    }

    private void checkDeviceManageScope(Device device, SignUser signUser) {
        if (!isManufacturer(signUser) && !this.checkDeviceScop(signUser, device)) {
            throw new AuthenticationException(OUT_OF_DATA_SCOPE);
        }
    }

    private Boolean checkDeviceScop(SignUser user, Device device) {
        List userScop = user.getAgentIdList();
        List deviceScop = Arrays.asList(device.getManuId(), device.getAgentId(), device.getSalerId());
        for (Object o : deviceScop) {
            for (Object o1 : userScop) {
                if (o.equals(o1)) {
                    return true;
                }
            }
        }
        return false;
    }
}