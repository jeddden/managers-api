package com.yunku.demo.common.baseclass;


import com.yunku.demo.common.respons.ResponseResult;

/**
 * @author Jeddden
 * @create 2019-06-25 13:42
 */
public class MyBaseController  {

    /**
     * 渲染失败数据
     *
     * @return result
     */
    protected ResponseResult renderError() {
        return ResponseResult.getFailResponseResult();
    }

    /**
     * 渲染失败数据（带消息）
     *
     * @param msg 需要返回的消息
     * @return result
     */
    protected ResponseResult renderError(String msg) {
        ResponseResult result = renderError();
        result.setMessage(msg);
        return result;
    }

    /**
     * 渲染成功数据
     *
     * @return result
     */
    protected ResponseResult renderSuccess() {
        return ResponseResult.getSuccessResponseResult();
    }

    /**
     * 渲染成功数据（带信息）
     *
     * @param msg 需要返回的信息
     * @return result
     */
    protected ResponseResult renderSuccess(String msg) {
        ResponseResult result = renderSuccess();
        result.setMessage(msg);
        return result;
    }

    /**
     * 渲染成功数据（带数据）
     *
     * @param obj 需要返回的对象
     * @return result
     */
    protected ResponseResult renderSuccess(Object obj) {
        ResponseResult result = renderSuccess();
        result.setData(obj);
        return result;
    }

    /**
     * 通过token获取openId
     *
     * @return result
     */
//    protected ShiroUser getShiroUser() {
//        return ShiroKit.getUser();
//    }

}
