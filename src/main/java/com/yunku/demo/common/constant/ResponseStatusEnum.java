package com.yunku.demo.common.constant;

/**
 * 返回结果状态封装
 *
 * @author Jeddden
 * @create 2019-08-19 20:53
 */
public enum ResponseStatusEnum {
    SECCESS_STATUS_DEFAULT(200, "请求成功"),
    INVLIDE_DATE_STRING(400, "输入日期格式不对"),
    FILE_READING_ERROR(500, "文件读取出错"),
    FILE_NOT_FOUND(404, "文件未找到"),
    REQUESTED_RESOURCE_NOT_EXIST(404, "请求资源不存在"),
    IO_ERROR(500, "流读取异常"),
    ENCRYPT_ERROR(500, "加解密错误"),
    RESPONSE_WRITE_ERROR(500, "渲染返回数据出错"),
    REMOTE_SERVICE_FAILURE(500,"远程服务调取失败"),
    WECHAT_SERVICE_FAILURE(500,"微信访问出错"),
    SERVICE_ERROR_DEFAULT(500, "服务器异常"),
    REMOTE_SERVICE_NULL(404, "远程服务不存在"),
    REMOTE_CONNECTION_TIMEOUT(404, "远程服务不存在"),
    ASYNC_ERROR(5000, "数据在被别人修改，请稍后重试"),
    TOKEN_EXPIRED(401, "会话超时"),
    NOT_MISSING_TOKEN(401, "没有经过验证的请求"),
    TOKEN_VERIFICATION_FAILED(401,"token验证失败"),
    OUT_OF_DATA_SCOPE(403,"超出数据管理范围");

    private int code;
    private String info;
    private ResponseStatusEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode(){
        return this.code;
    }
    public String getInfo(){
        return this.info;
    }
}
