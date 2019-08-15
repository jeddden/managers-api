package com.yunku.demo.core.model;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 操作日志
 * </p>
 *
 */
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long operationLogId;

    /**
     * 日志类型(字典)
     */
    private String logType;

    /**
     * 日志名称
     */
    private String logName;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 类名称
     */
    private String className;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否成功(字典)
     */
    private String succeed;

    /**
     * 备注
     */
    private String message;


    public Long getOperationLogId() {
        return operationLogId;
    }

    public void setOperationLogId(Long operationLogId) {
        this.operationLogId = operationLogId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSucceed() {
        return succeed;
    }

    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "OperationLog{" +
        "operationLogId=" + operationLogId +
        ", logType=" + logType +
        ", logName=" + logName +
        ", userId=" + userId +
        ", className=" + className +
        ", method=" + method +
        ", createTime=" + createTime +
        ", succeed=" + succeed +
        ", message=" + message +
        "}";
    }
}
