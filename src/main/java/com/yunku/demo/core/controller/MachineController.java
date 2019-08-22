package com.yunku.demo.core.controller;

import com.alibaba.fastjson.JSONObject;
import com.yunku.demo.common.Json;
import com.yunku.demo.common.baseclass.MyBaseController;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.common.respons.ResponseData;
import com.yunku.demo.core.model.Device;
import com.yunku.demo.core.service.DeviceService;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.tool.iot.InvokeDeviceUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

import static com.yunku.demo.common.constant.ResponseStatusEnum.*;

@RestController
@Scope("prototype")
@RequestMapping("/machine")
@Api(tags = "设备功能")
public class MachineController extends MyBaseController {

    @Autowired
    private DeviceService deviceService;

    @ApiModel
    class ChargeStatus {
        @ApiModelProperty(value = "电压")
        public Long voltage;

        @ApiModelProperty(value = "电流")
        public String current;

        @ApiModelProperty(value = "功率")
        public String power;

        @ApiModelProperty(value = "电量")
        public String electricity;

        @ApiModelProperty(value = "温度")
        public String temperature;

        @ApiModelProperty(value = "状态")
        public String doorStatus;
    }

    @ApiModel
    class History {
        @ApiModelProperty(value = "设备号")
        public String deviceCode;

        @ApiModelProperty(value = "地址")
        public String address;

        @ApiModelProperty(value = "操作人")
        public String opName;

        @ApiModelProperty(value = "操作时间")
        public Date opTime;
    }

    @RequestMapping("/history")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "历史记录", notes = "分页查询数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码，从1开始", required = true, paramType = "form"),
            @ApiImplicitParam(name = "rows", value = "每页显示记录数，默认50条", required = true, paramType = "form")
    })
    public Json<List<History>> history(HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/getDoorInfo/{id}")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "GET", value = "读取门数据", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceId", value = "设备id号", required = true, paramType = "form")
    })
    public ResponseData getDoorInfo(@PathVariable("id") Integer deviceId) throws Exception {
        SignUser signUser = getSignUser();
        Device device = deviceService.fetchById(deviceId);
        if (device == null) {
            return this.renderError(REQUESTED_RESOURCE_NOT_EXIST);
        }
        JSONObject jsonObject = null;
        if (signUser.getIsAgentAdmin() == 0 && !signUser.getAgentIdList().contains(device.getAgentId())) {
            return this.renderError(OUT_OF_DATA_SCOPE);
        }
        jsonObject = InvokeDeviceUtil.invokeDevice("cloud-162", device.getDeviceCode(), null);
        return this.renderSuccess(jsonObject);
    }

    @RequestMapping("/openDoor")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "开门")
    @ApiImplicitParams({
    })
    public Object openDoor(Integer port, String deviceCode) {
        Json j = new Json();
        /*对设备发送指令开始充电*/
        JSONObject Obj = null;
        JSONObject data = new JSONObject();
        data.put("orderId", 0);
        data.put("port", port);
        data.put("command", 3);
        try {
            Obj = InvokeDeviceUtil.invokeDevice("cloud-161", deviceCode, data);
            Integer status = Obj.getInteger("status");
            if (status == 0) {
                j.setSuccess(true);
                j.setMsg("开门成功");
            } else {
                j.setMsg("开门失败，请稍后再试！");
            }
        } catch (Exception e) {
            j.setMsg("cloud-161服务调用异常，原因:" + e.getMessage());
            e.printStackTrace();
            System.out.println("cloud-161服务调用异常，原因:" + e.getMessage());
        }
        return Obj;
    }

    @RequestMapping("/putBattery")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "放电池")
    @ApiImplicitParams({
    })
    public Json putBattery(HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/startCharge")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "充电")
    @ApiImplicitParams({
    })
    public ResponseData startCharge(Integer port, String deviceCode) {
        Json j = new Json();
        /*对设备发送指令开始充电*/
        JSONObject Obj = null;
        JSONObject data = new JSONObject();
        data.put("orderId", 0);
        data.put("port", port);
        data.put("command", 8);
        try {
            Obj = InvokeDeviceUtil.invokeDevice("cloud-161", deviceCode, data);
            Integer status = Obj.getInteger("status");
            if (status == 0) {
                j.setSuccess(true);
                j.setMsg("开始充电成功");
            } else {
                j.setMsg("开始充电失败，请稍后再试！");
            }
        } catch (Exception e) {
            j.setMsg("cloud-161服务调用异常，原因:" + e.getMessage());
            e.printStackTrace();
            System.out.println("cloud-161服务调用异常，原因:" + e.getMessage());
        }
        return renderSuccess(Obj);
    }

    @RequestMapping("/stopCharge")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "断电")
    @ApiImplicitParams({
    })
    public ResponseData stopCharge(Integer port, String deviceCode) {
        Json j = new Json();
        /*对设备发送指令开始充电*/
        JSONObject Obj = null;
        JSONObject data = new JSONObject();
        data.put("orderId", 0);
        data.put("port", port);
        data.put("command", 1);
        try {
            Obj = InvokeDeviceUtil.invokeDevice("cloud-161", deviceCode, data);
            Integer status = Obj.getInteger("status");
            if (status == 0) {
                j.setSuccess(true);
                j.setMsg("充电成功");
            } else {
                j.setMsg("充电失败，请稍后再试！");
            }
        } catch (Exception e) {
            j.setMsg("cloud-161服务调用异常，原因:" + e.getMessage());
            e.printStackTrace();
            System.out.println("cloud-161服务调用异常，原因:" + e.getMessage());
        }
        return this.renderSuccess(Obj);
    }

    @RequestMapping("/readData")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "实时读取设备数据", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceId", value = "设备id号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "index", value = "门id", required = true, paramType = "form")
    })
    public ResponseData readData(String deviceCode) {
        JSONObject object = null;
        try {
            object = InvokeDeviceUtil.invokeDevice("cloud-168",deviceCode,null);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(REMOTE_SERVICE_FAILURE);
        }
        return renderSuccess(object);
    }


}
