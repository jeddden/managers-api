package com.yunku.demo.core.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunku.demo.common.MyPageInfo;
import com.yunku.demo.common.baseclass.MyBaseController;
import com.yunku.demo.common.respons.ResponseData;
import com.yunku.demo.core.model.DeviceOperatingLog;
import com.yunku.demo.core.service.DeviceOperatingLogService;
import com.yunku.demo.core.service.IotService;
import io.swagger.annotations.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("prototype")
@RequestMapping("/machine")
@Api(tags = "设备功能")
public class MachineController extends MyBaseController {

    @Autowired
    private IotService iotService;

    @Autowired
    private DeviceOperatingLogService deviceOperatingLogService;

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


    @RequestMapping("/history")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "历史记录", notes = "分页查询数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码，从1开始", required = true, paramType = "form"),
            @ApiImplicitParam(name = "pageSize", value = "每页显示记录数，默认20条", required = true, paramType = "form")
    })
    public ResponseData history(MyPageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        List<DeviceOperatingLog> list = deviceOperatingLogService.selectByUserId(getSignUser().getId().intValue());
        PageInfo<DeviceOperatingLog> data = new PageInfo<>(list);
        return renderSuccess(data);
    }

    @RequestMapping("/getDoorInfo/{deviceCode}")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "GET", value = "读取门数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form")
    })
    public ResponseData getDoorInfo(@PathVariable("deviceCode") String deviceCode) throws Exception {
        JSONObject jsonObject;
        jsonObject = iotService.getDoorInfo(deviceCode);
        Integer result = jsonObject.getInteger("result");
        if (result != null && result.equals(0)) {
            return this.renderSuccess(jsonObject.get("devPortSts"));
        } else {
            return this.renderError(jsonObject.toJSONString());
        }
    }

    @RequestMapping("/openDoor")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "开门")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "port", value = "端口号", required = true, paramType = "form")
    })
    public ResponseData openDoor(Integer port, String deviceCode) {
        /*对设备发送指令开始充电*/
        if (port == null || StringUtils.isEmpty(deviceCode)) {
            return this.renderError("参数不能为空。");
        }
        JSONObject jsonObject = iotService.openDoor(deviceCode, port);
        Integer status = jsonObject.getInteger("code");
        if (status != null && status.equals(0)) {
            return renderSuccess("开门成功");
        } else {
            return renderError("开门失败，请稍后再试！");
        }

    }

    @RequestMapping("/putBattery")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "放电池")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "port", value = "端口号", required = true, paramType = "form")
    })
    public ResponseData putBattery(String deviceCode, Integer port) {
        if (port == null || StringUtils.isEmpty(deviceCode)) {
            return this.renderError("参数不能为空。");
        }
        /*对设备发送指令开始充电*/
        JSONObject jsonObject = iotService.putBattery(deviceCode, port);
        Integer status = jsonObject.getInteger("code");
        if (status != null && status.equals(0)) {
            return renderSuccess("放入电池");
        } else {
            return renderError("放电池失败，请稍后再试！");
        }
    }

    @RequestMapping("/startCharge")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "充电")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "port", value = "端口号", required = true, paramType = "form")
    })
    public ResponseData startCharge(Integer port, String deviceCode) {
        if (port == null || StringUtils.isEmpty(deviceCode)) {
            return this.renderError("参数不能为空。");
        }
        JSONObject jsonObject = iotService.startCharge(deviceCode, port);
        Integer status = jsonObject.getInteger("code");
        if (status != null && status.equals(0)) {
            return renderSuccess("开始充电");
        } else {
            return renderError("操作失败，请稍后再试！");
        }
    }

    @RequestMapping("/stopCharge")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "断电")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "port", value = "端口号", required = true, paramType = "form")
    })
    public ResponseData stopCharge(Integer port, String deviceCode) {
        if (port == null || StringUtils.isEmpty(deviceCode)) {
            return this.renderError("参数不能为空。");
        }
        JSONObject jsonObject = iotService.stopCharge(deviceCode, port);
        Integer status = jsonObject.getInteger("code");
        if (status != null && status.equals(0)) {
            return renderSuccess("停止充电");
        } else {
            return renderError("操作失败，请稍后再试！");
        }
    }

    @RequestMapping("/readData")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "实时读取设备数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form")
    })
    public ResponseData readData(String deviceCode) {
        if (StringUtils.isEmpty(deviceCode)) {
            return this.renderError("参数不能为空。");
        }
        JSONObject object;
        object = iotService.readData(deviceCode);
        Integer result = object.getInteger("result");
        if (result != null && result.equals(0)) {
            return renderSuccess(object.get("devPortChargeSts"));
        } else {
            return renderError(object.toJSONString());
        }
    }

    @RequestMapping("/readPortInfor")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "实时读取设备数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceCode", value = "设备号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "port", value = "端口号", required = true, paramType = "form")
    })
    public ResponseData readPortInfor(String deviceCode, Integer port) {
        if (StringUtils.isEmpty(deviceCode) || port == null) {
            return this.renderError("参数不能为空。");
        }
        JSONObject object;
        object = iotService.readPortInfor(deviceCode, port);
        return this.renderSuccess(object);
//        Integer result = object.getInteger("result");
//        if (result != null && result.equals(0)) {
//            return renderSuccess(object.get("devPortChargeSts"));
//        } else {
//            return renderError(object.toJSONString());
//        }
    }

//    @RequestMapping("testOpen")
//    @ResponseBody
//    public ResponseData testOpenDoor(String deviceCode,Integer port){
//        JSONObject Obj = null;
//        JSONObject data = new JSONObject();
//        data.put("orderId", 0);
//        data.put("port", port);
//        data.put("command", 3);
//        try {
//            Obj = InvokeDeviceUtil.invokeDevice("cloud-161", deviceCode, data);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ServiceException(REMOTE_SERVICE_FAILURE);
//        }
//        return this.renderSuccess(Obj);
//    }

}
