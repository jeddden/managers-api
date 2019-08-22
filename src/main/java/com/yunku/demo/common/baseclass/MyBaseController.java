package com.yunku.demo.common.baseclass;


import com.yunku.demo.common.constant.ResponseStatusEnum;
import com.yunku.demo.common.respons.ErrorResponseData;
import com.yunku.demo.common.respons.ResponseData;
import com.yunku.demo.common.respons.SuccessResponseData;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.tool.MySubjectContext;

import static com.yunku.demo.common.constant.ResponseStatusEnum.SERVICE_ERROR_DEFAULT;

/**
 * @author Jeddden
 * @create 2019-06-25 13:42
 */
public class MyBaseController extends BaseController {

    /**
     * 渲染失败数据
     *
     * @return result
     */
    protected ResponseData renderServiceError() {
        return new ErrorResponseData(SERVICE_ERROR_DEFAULT);
    }

    /**
     * 渲染失败数据（带消息）
     *
     * @param msg 需要返回的消息
     * @return result
     */
    protected ResponseData renderError(String msg) {
        return new ErrorResponseData(msg);
    }



    protected ResponseData renderError(ResponseStatusEnum responseStatusEnum) {
        return new ErrorResponseData(responseStatusEnum);
    }

    /**
     * 渲染成功数据
     *
     * @return result
     */
    protected ResponseData renderSuccess() {
        return new SuccessResponseData();
    }

    /**
     * 渲染成功数据（带信息）
     *
     * @param msg 需要返回的信息
     * @return result
     */
    protected ResponseData renderSuccess(String msg) {
        return new SuccessResponseData(msg);
    }

    /**
     * 渲染成功数据（带数据）
     *
     * @param obj 需要返回的对象
     * @return result
     */
    protected ResponseData renderSuccess(Object obj) {
        return new SuccessResponseData(obj);
    }

    /**
     * 获取SignUser
     *
     * @return result
     */
    protected SignUser getSignUser() {
        return MySubjectContext.get();
    }

    /**
     * 返回前端success=false 的responseData
     * @param msg
     * @return
     */
    protected ResponseData renderSuccessFalse(String msg) {
        return new ResponseData(false, SuccessResponseData.DEFAULT_SUCCESS_CODE, msg, null);
    }
}
