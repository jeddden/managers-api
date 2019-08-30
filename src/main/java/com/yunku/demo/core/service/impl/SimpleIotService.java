package com.yunku.demo.core.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yunku.demo.common.annotion.OperatingLog;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.core.model.Device;
import com.yunku.demo.core.service.IotService;
import com.yunku.demo.tool.HttpContext;
import com.yunku.demo.tool.iot.DeviceCommand;
import com.yunku.demo.tool.iot.InvokeDeviceUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

import static com.yunku.demo.common.constant.ResponseStatusEnum.REMOTE_SERVICE_FAILURE;

/**
 * @author Jeddden
 * @create 2019-08-24 17:19
 */
@Service
public class SimpleIotService implements IotService {

    private static JSONObject getPutJsonObject(int port, int command) {
        JSONObject data = new JSONObject();
        data.put("orderId", 0);
        data.put("port", port);
        if (command != -1) {
            data.put("command", command);
        }
        return data;
    }

    // cloud-162
    @Override
    @OperatingLog(value = "读取设备端口充电状态", port = false)
    public JSONObject getDoorInfo(String deviceCode) {
        return invorkDeviceCommand(deviceCode, 0, DeviceCommand.READ_PORT_CHARGING_STATUS);
    }

    // cloud-168
    @Override
    @OperatingLog(value = "查询所有端口充电状态", port = false)
    public JSONObject readData(String deviceCode) {
        return invorkDeviceCommand(deviceCode, 0, DeviceCommand.READ_PORT_CHARGING_STATUS_INFO);
    }

    @Override
    @OperatingLog("读取端口实时数据")
    public JSONObject readPortInfor(String deviceCode, int port) {
        return invorkDeviceCommand(deviceCode, port, DeviceCommand.READ_PORT_INFORMTION);
    }

    // cloud-161
    @Override
    @OperatingLog("开启柜门")
    public JSONObject openDoor(String deviceCode, int port) {
        HttpServletRequest request = HttpContext.getRequest();
        Object o = request.getAttribute("device");
        if (o == null) {
            throw new ServiceException("参数提取出错");
        }
        Device device = ((Device) o);
        if (device.getType() == 3) {
            return invorkDeviceCommand(deviceCode, port, DeviceCommand.OPEN_RECHARGER_BOX_DOOR);
        } else {
            return invorkDeviceCommand(deviceCode, port, DeviceCommand.OPEN_CHARGER_BOX_DOOR);
        }
    }


    // cloud-161
    @Override
    @OperatingLog("放电池")
    public JSONObject putBattery(String deviceCode, int port) {
        return invorkDeviceCommand(deviceCode, port, DeviceCommand.PUT_RECHARGER_BOX_BATTERY);
    }

    // cloud-161
    @Override
    @OperatingLog("开始充电")
    public JSONObject startCharge(String deviceCode, int port) {
        return invorkDeviceCommand(deviceCode, port, DeviceCommand.START_CHARGE);
    }

    // cloud-161
    @Override
    @OperatingLog("停止充电")
    public JSONObject stopCharge(String deviceCode, int port) {
        return invorkDeviceCommand(deviceCode, port, DeviceCommand.STOP_CHARGE);
    }

    public static JSONObject invorkDeviceCommand(String deviceCode, int port, DeviceCommand command) {
        if (command == null) {
            throw new ServiceException("device command can't be null");
        }
        JSONObject object, data = null;
        if (command.getCommand() != null) {
            data = getPutJsonObject(port, command.getCommand());
        }
        try {
            object = InvokeDeviceUtil.invokeDevice(command.getActionId(), deviceCode, data);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(REMOTE_SERVICE_FAILURE);
        }
        return object;
    }
}
