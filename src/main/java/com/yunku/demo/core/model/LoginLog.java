package com.yunku.demo.core.model;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 登录记录
 * </p>
 *
 */
public class LoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long loginLogId;

    /**
     * 日志名称
     */
    private String logName;

    /**
     * 管理员id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否执行成功
     */
    private String succeed;

    /**
     * 具体消息
     */
    private String message;

    /**
     * 登录ip
     */
    private String ipAddress;


    public Long getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Long loginLogId) {
        this.loginLogId = loginLogId;
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
        "loginLogId=" + loginLogId +
        ", logName=" + logName +
        ", userId=" + userId +
        ", createTime=" + createTime +
        ", succeed=" + succeed +
        ", message=" + message +
        ", ipAddress=" + ipAddress +
        "}";
    }
}
