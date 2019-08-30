package com.yunku.demo.tool.iot;

import com.alibaba.fastjson.JSONObject;
import com.yunku.demo.config.IotConfig;
import com.yunku.demo.tool.SpringContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

public class InvokeDeviceUtil {

    private static final Logger logger = LoggerFactory.getLogger(InvokeDeviceUtil.class);

    public static JSONObject invokeDevice(String actionId, String deviceCode, JSONObject data) throws Exception {
        JSONObject params = new JSONObject();
        JSONObject session = new JSONObject();
        params.put("actionId",actionId);
        session.put("deviceName",deviceCode);
        params.put("session",session);
        if(null == data) {
            data = new JSONObject();
        }
        params.put("data",data);
        String result = RestTemplateUtils.post(SpringContextHolder.getBean(IotConfig.class).getBridgeUrl(), params, MediaType.APPLICATION_JSON_UTF8);
        if(!StringUtils.isEmpty(result)) {
            JSONObject ret = JSONObject.parseObject(result);
            if(0 == ret.getInteger("rtnCode")) {
                JSONObject jData = ret.getJSONObject("data");
                return jData;
            } else { //服务异常
                String rtnMessage = ret.getString("rtnMessage");
                logger.error("actionId服务调用异常，原因:" + rtnMessage);
                throw new Exception(rtnMessage);
            }
        }
        return null;
    }

    public static JSONObject handleDevice(String actionId, JSONObject data) throws Exception {
        JSONObject params = new JSONObject();
        params.put("actionId",actionId);
        params.put("data",data);
        String result = RestTemplateUtils.post(SpringContextHolder.getBean(IotConfig.class).getBridgeUrl(), params, MediaType.APPLICATION_JSON_UTF8);
        if(!StringUtils.isEmpty(result)) {
            JSONObject ret = JSONObject.parseObject(result);
            if(0 == ret.getInteger("rtnCode")) {
                JSONObject jData = ret.getJSONObject("data");
                return jData;
            } else { //服务异常
                String rtnMessage = ret.getString("rtnMessage");
                logger.error("CloudManageDeviceLifeReq服务调用异常，原因:" + rtnMessage);
                throw new Exception(rtnMessage);
            }
        }
        return null;
    }

}
