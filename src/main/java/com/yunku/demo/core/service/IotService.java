package com.yunku.demo.core.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 桥接服务
 *
 * @author Jeddden
 * @create 2019-08-24 17:12
 */
public interface IotService {

    JSONObject getDoorInfo(String deviceCode) throws Exception;

    JSONObject openDoor(String deviceCode, int port);

    JSONObject putBattery(String deviceCode, int port);

    JSONObject startCharge(String deviceCode, int port);

    JSONObject stopCharge(String deviceCode, int port);

    JSONObject readData(String deviceCode);

    JSONObject readPortInfor(String deviceCode, int port);


}
