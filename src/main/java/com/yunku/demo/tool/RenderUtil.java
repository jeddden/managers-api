package com.yunku.demo.tool;

import com.alibaba.fastjson.JSON;
import com.yunku.demo.common.constant.ResponseStatusEnum;
import com.yunku.demo.common.exception.ServiceException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response数据渲染
 *
 * @author Jeddden
 * @create 2019-08-14 15:29
 */
public class RenderUtil {
    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new ServiceException(ResponseStatusEnum.RESPONSE_WRITE_ERROR);
        }
    }

    public static void renderJson401(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
            response.setStatus(401);
        } catch (IOException e) {
            throw new ServiceException(ResponseStatusEnum.RESPONSE_WRITE_ERROR);
        }
    }

}
