package com.yunku.demo.common.exception;

/**
 * .
 *
 * @author Jeddden
 * @create 2019-06-14 17:03
 */
public enum CoreExceptionEnum implements AbstractBaseExceptionEnum {
    INVLIDE_DATE_STRING(400, "输入日期格式不对"),
    NO_CURRENT_USER(700, "当前没有登录的用户"),
    INIT_TABLE_EMPTY_PARAMS(701, "初始化数据库，存在为空的字段"),
    WRITE_ERROR(500, "渲染界面错误"),
    ENCRYPT_ERROR(600, "加解密错误"),
    FILE_READING_ERROR(400, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(400, "FILE_NOT_FOUND!"),
    FIELD_VALIDATE_ERROR(700, "数据库字段与实体字段不一致!"),
    PAGE_NULL(404, "请求页面不存在"),
    IO_ERROR(500, "流读取异常"),
    SERVICE_ERROR(500, "服务器异常"),
    REMOTE_SERVICE_NULL(404, "远程服务不存在"),
    ASYNC_ERROR(5000, "数据在被别人修改，请稍后重试"),
    TOKEN_EXPIRED(700, "token过期"),
    TOKEN_ERROR(700, "token验证失败"),

    /**
     * 签名异常
     */
    SIGN_ERROR(700, "签名验证失败"),

    /**
     * 其他
     */
    AUTH_REQUEST_ERROR(400, "账号密码错误");
    private Integer code;
    private String message;

    private CoreExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
