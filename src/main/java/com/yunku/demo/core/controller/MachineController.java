package com.yunku.demo.core.controller;

import com.yunku.demo.common.baseclass.BaseController;
import com.yunku.demo.common.Json;
import io.swagger.annotations.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@Controller
@Scope("prototype")
@RequestMapping("/machine")
@Api(tags = "设备功能")
public class MachineController extends BaseController {

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
            @ApiImplicitParam(name="page",value="页码，从1开始",required=true,paramType="form"),
            @ApiImplicitParam(name="rows",value="每页显示记录数，默认50条",required=true,paramType="form")
    })
    public Json<List<History>> history(HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/getDoorInfo")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "读取门数据", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name="deviceId",value="设备id号",required=true,paramType="form")
    })
    public Json<List<Integer>> getDoorInfo(HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/openDoor")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "开门")
    @ApiImplicitParams({
    })
    public Json openDoor(HttpServletRequest request) {
        return null;
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
    public Json startCharge(HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/stopCharge")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "断电")
    @ApiImplicitParams({
    })
    public Json stopCharge(HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/readData")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "操作成功")
    })
    @ApiOperation(httpMethod = "POST", value = "实时读取设备数据", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name="deviceId",value="设备id号",required=true,paramType="form"),
            @ApiImplicitParam(name="index",value="门id",required=true,paramType="form")
    })
    public Json<ChargeStatus> readData(HttpServletRequest request) {
        return null;
    }



}
