package com.yunku.demo.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_device
 * @author 
 */
public class Device implements Serializable {
    private Integer id;

    private String name;

    private String deviceCode;

    /**
     * 小区名称
     */
    private String areaname;

    /**
     * 维护人员
     */
    private String maintainer;

    /**
     * 维护人员手机
     */
    private String mobile;

    private String description;

    private Integer status;

    private Integer onlineStatus;

    private Long userId;

    private Long payStrategyId;

    private Integer chargeTimeId;

    /**
     * 加密方式：0，rsa；1，des；2，aes；12，8583 aes
     */
    private Integer encryption;

    private String privateKey;

    private String publicKey;

    private Date createTime;

    private Date updateTime;

    private Date bindTime;

    private Date unbindTime;

    /**
     * 设备延时时间，以毫秒为单位
     */
    private Integer overtime;

    private Integer isDelete;

    /**
     * 支付宝code
     */
    private String alipayCode;

    private Integer deviceTypeId;

    private Long settleTypeId;

    private Integer alipayCodeFlag;

    private Integer debugFlag;

    private Long productId;

    private Integer hardware;

    private Date startRunTime;

    private Integer monthlyCharge;

    private Integer icOrderFlag;

    private Long produceUserId;

    private Integer notifyOfflineFlag;

    private Date notifyOfflineTime;

    private String aliyun;

    private String ccid;

    private Integer ccidFlag;

    /**
     * 最小功率，单位：W
     */
    private Integer minPower;

    /**
     * 最大功率，单位：W
     */
    private Integer maxPower;

    /**
     * 浮充时间，单位：min分钟
     */
    private Integer minPowerTime;

    /**
     * 版本号
     */
    private String version;

    /**
     * 锁定状态：0为不锁定，1为锁定
     */
    private Byte lockStatus;

    private Integer manuId;

    private Integer agentId;

    private Integer salerId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPayStrategyId() {
        return payStrategyId;
    }

    public void setPayStrategyId(Long payStrategyId) {
        this.payStrategyId = payStrategyId;
    }

    public Integer getChargeTimeId() {
        return chargeTimeId;
    }

    public void setChargeTimeId(Integer chargeTimeId) {
        this.chargeTimeId = chargeTimeId;
    }

    public Integer getEncryption() {
        return encryption;
    }

    public void setEncryption(Integer encryption) {
        this.encryption = encryption;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public Date getUnbindTime() {
        return unbindTime;
    }

    public void setUnbindTime(Date unbindTime) {
        this.unbindTime = unbindTime;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getAlipayCode() {
        return alipayCode;
    }

    public void setAlipayCode(String alipayCode) {
        this.alipayCode = alipayCode;
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Long getSettleTypeId() {
        return settleTypeId;
    }

    public void setSettleTypeId(Long settleTypeId) {
        this.settleTypeId = settleTypeId;
    }

    public Integer getAlipayCodeFlag() {
        return alipayCodeFlag;
    }

    public void setAlipayCodeFlag(Integer alipayCodeFlag) {
        this.alipayCodeFlag = alipayCodeFlag;
    }

    public Integer getDebugFlag() {
        return debugFlag;
    }

    public void setDebugFlag(Integer debugFlag) {
        this.debugFlag = debugFlag;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getHardware() {
        return hardware;
    }

    public void setHardware(Integer hardware) {
        this.hardware = hardware;
    }

    public Date getStartRunTime() {
        return startRunTime;
    }

    public void setStartRunTime(Date startRunTime) {
        this.startRunTime = startRunTime;
    }

    public Integer getMonthlyCharge() {
        return monthlyCharge;
    }

    public void setMonthlyCharge(Integer monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public Integer getIcOrderFlag() {
        return icOrderFlag;
    }

    public void setIcOrderFlag(Integer icOrderFlag) {
        this.icOrderFlag = icOrderFlag;
    }

    public Long getProduceUserId() {
        return produceUserId;
    }

    public void setProduceUserId(Long produceUserId) {
        this.produceUserId = produceUserId;
    }

    public Integer getNotifyOfflineFlag() {
        return notifyOfflineFlag;
    }

    public void setNotifyOfflineFlag(Integer notifyOfflineFlag) {
        this.notifyOfflineFlag = notifyOfflineFlag;
    }

    public Date getNotifyOfflineTime() {
        return notifyOfflineTime;
    }

    public void setNotifyOfflineTime(Date notifyOfflineTime) {
        this.notifyOfflineTime = notifyOfflineTime;
    }

    public String getAliyun() {
        return aliyun;
    }

    public void setAliyun(String aliyun) {
        this.aliyun = aliyun;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public Integer getCcidFlag() {
        return ccidFlag;
    }

    public void setCcidFlag(Integer ccidFlag) {
        this.ccidFlag = ccidFlag;
    }

    public Integer getMinPower() {
        return minPower;
    }

    public void setMinPower(Integer minPower) {
        this.minPower = minPower;
    }

    public Integer getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(Integer maxPower) {
        this.maxPower = maxPower;
    }

    public Integer getMinPowerTime() {
        return minPowerTime;
    }

    public void setMinPowerTime(Integer minPowerTime) {
        this.minPowerTime = minPowerTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Byte getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Byte lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getManuId() {
        return manuId;
    }

    public void setManuId(Integer manuId) {
        this.manuId = manuId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getSalerId() {
        return salerId;
    }

    public void setSalerId(Integer salerId) {
        this.salerId = salerId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Device other = (Device) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDeviceCode() == null ? other.getDeviceCode() == null : this.getDeviceCode().equals(other.getDeviceCode()))
            && (this.getAreaname() == null ? other.getAreaname() == null : this.getAreaname().equals(other.getAreaname()))
            && (this.getMaintainer() == null ? other.getMaintainer() == null : this.getMaintainer().equals(other.getMaintainer()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOnlineStatus() == null ? other.getOnlineStatus() == null : this.getOnlineStatus().equals(other.getOnlineStatus()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPayStrategyId() == null ? other.getPayStrategyId() == null : this.getPayStrategyId().equals(other.getPayStrategyId()))
            && (this.getChargeTimeId() == null ? other.getChargeTimeId() == null : this.getChargeTimeId().equals(other.getChargeTimeId()))
            && (this.getEncryption() == null ? other.getEncryption() == null : this.getEncryption().equals(other.getEncryption()))
            && (this.getPrivateKey() == null ? other.getPrivateKey() == null : this.getPrivateKey().equals(other.getPrivateKey()))
            && (this.getPublicKey() == null ? other.getPublicKey() == null : this.getPublicKey().equals(other.getPublicKey()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBindTime() == null ? other.getBindTime() == null : this.getBindTime().equals(other.getBindTime()))
            && (this.getUnbindTime() == null ? other.getUnbindTime() == null : this.getUnbindTime().equals(other.getUnbindTime()))
            && (this.getOvertime() == null ? other.getOvertime() == null : this.getOvertime().equals(other.getOvertime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getAlipayCode() == null ? other.getAlipayCode() == null : this.getAlipayCode().equals(other.getAlipayCode()))
            && (this.getDeviceTypeId() == null ? other.getDeviceTypeId() == null : this.getDeviceTypeId().equals(other.getDeviceTypeId()))
            && (this.getSettleTypeId() == null ? other.getSettleTypeId() == null : this.getSettleTypeId().equals(other.getSettleTypeId()))
            && (this.getAlipayCodeFlag() == null ? other.getAlipayCodeFlag() == null : this.getAlipayCodeFlag().equals(other.getAlipayCodeFlag()))
            && (this.getDebugFlag() == null ? other.getDebugFlag() == null : this.getDebugFlag().equals(other.getDebugFlag()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getHardware() == null ? other.getHardware() == null : this.getHardware().equals(other.getHardware()))
            && (this.getStartRunTime() == null ? other.getStartRunTime() == null : this.getStartRunTime().equals(other.getStartRunTime()))
            && (this.getMonthlyCharge() == null ? other.getMonthlyCharge() == null : this.getMonthlyCharge().equals(other.getMonthlyCharge()))
            && (this.getIcOrderFlag() == null ? other.getIcOrderFlag() == null : this.getIcOrderFlag().equals(other.getIcOrderFlag()))
            && (this.getProduceUserId() == null ? other.getProduceUserId() == null : this.getProduceUserId().equals(other.getProduceUserId()))
            && (this.getNotifyOfflineFlag() == null ? other.getNotifyOfflineFlag() == null : this.getNotifyOfflineFlag().equals(other.getNotifyOfflineFlag()))
            && (this.getNotifyOfflineTime() == null ? other.getNotifyOfflineTime() == null : this.getNotifyOfflineTime().equals(other.getNotifyOfflineTime()))
            && (this.getAliyun() == null ? other.getAliyun() == null : this.getAliyun().equals(other.getAliyun()))
            && (this.getCcid() == null ? other.getCcid() == null : this.getCcid().equals(other.getCcid()))
            && (this.getCcidFlag() == null ? other.getCcidFlag() == null : this.getCcidFlag().equals(other.getCcidFlag()))
            && (this.getMinPower() == null ? other.getMinPower() == null : this.getMinPower().equals(other.getMinPower()))
            && (this.getMaxPower() == null ? other.getMaxPower() == null : this.getMaxPower().equals(other.getMaxPower()))
            && (this.getMinPowerTime() == null ? other.getMinPowerTime() == null : this.getMinPowerTime().equals(other.getMinPowerTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getLockStatus() == null ? other.getLockStatus() == null : this.getLockStatus().equals(other.getLockStatus()))
            && (this.getManuId() == null ? other.getManuId() == null : this.getManuId().equals(other.getManuId()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getSalerId() == null ? other.getSalerId() == null : this.getSalerId().equals(other.getSalerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDeviceCode() == null) ? 0 : getDeviceCode().hashCode());
        result = prime * result + ((getAreaname() == null) ? 0 : getAreaname().hashCode());
        result = prime * result + ((getMaintainer() == null) ? 0 : getMaintainer().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOnlineStatus() == null) ? 0 : getOnlineStatus().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPayStrategyId() == null) ? 0 : getPayStrategyId().hashCode());
        result = prime * result + ((getChargeTimeId() == null) ? 0 : getChargeTimeId().hashCode());
        result = prime * result + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        result = prime * result + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        result = prime * result + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBindTime() == null) ? 0 : getBindTime().hashCode());
        result = prime * result + ((getUnbindTime() == null) ? 0 : getUnbindTime().hashCode());
        result = prime * result + ((getOvertime() == null) ? 0 : getOvertime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getAlipayCode() == null) ? 0 : getAlipayCode().hashCode());
        result = prime * result + ((getDeviceTypeId() == null) ? 0 : getDeviceTypeId().hashCode());
        result = prime * result + ((getSettleTypeId() == null) ? 0 : getSettleTypeId().hashCode());
        result = prime * result + ((getAlipayCodeFlag() == null) ? 0 : getAlipayCodeFlag().hashCode());
        result = prime * result + ((getDebugFlag() == null) ? 0 : getDebugFlag().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getHardware() == null) ? 0 : getHardware().hashCode());
        result = prime * result + ((getStartRunTime() == null) ? 0 : getStartRunTime().hashCode());
        result = prime * result + ((getMonthlyCharge() == null) ? 0 : getMonthlyCharge().hashCode());
        result = prime * result + ((getIcOrderFlag() == null) ? 0 : getIcOrderFlag().hashCode());
        result = prime * result + ((getProduceUserId() == null) ? 0 : getProduceUserId().hashCode());
        result = prime * result + ((getNotifyOfflineFlag() == null) ? 0 : getNotifyOfflineFlag().hashCode());
        result = prime * result + ((getNotifyOfflineTime() == null) ? 0 : getNotifyOfflineTime().hashCode());
        result = prime * result + ((getAliyun() == null) ? 0 : getAliyun().hashCode());
        result = prime * result + ((getCcid() == null) ? 0 : getCcid().hashCode());
        result = prime * result + ((getCcidFlag() == null) ? 0 : getCcidFlag().hashCode());
        result = prime * result + ((getMinPower() == null) ? 0 : getMinPower().hashCode());
        result = prime * result + ((getMaxPower() == null) ? 0 : getMaxPower().hashCode());
        result = prime * result + ((getMinPowerTime() == null) ? 0 : getMinPowerTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getLockStatus() == null) ? 0 : getLockStatus().hashCode());
        result = prime * result + ((getManuId() == null) ? 0 : getManuId().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getSalerId() == null) ? 0 : getSalerId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", deviceCode=").append(deviceCode);
        sb.append(", areaname=").append(areaname);
        sb.append(", maintainer=").append(maintainer);
        sb.append(", mobile=").append(mobile);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", userId=").append(userId);
        sb.append(", payStrategyId=").append(payStrategyId);
        sb.append(", chargeTimeId=").append(chargeTimeId);
        sb.append(", encryption=").append(encryption);
        sb.append(", privateKey=").append(privateKey);
        sb.append(", publicKey=").append(publicKey);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", bindTime=").append(bindTime);
        sb.append(", unbindTime=").append(unbindTime);
        sb.append(", overtime=").append(overtime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", alipayCode=").append(alipayCode);
        sb.append(", deviceTypeId=").append(deviceTypeId);
        sb.append(", settleTypeId=").append(settleTypeId);
        sb.append(", alipayCodeFlag=").append(alipayCodeFlag);
        sb.append(", debugFlag=").append(debugFlag);
        sb.append(", productId=").append(productId);
        sb.append(", hardware=").append(hardware);
        sb.append(", startRunTime=").append(startRunTime);
        sb.append(", monthlyCharge=").append(monthlyCharge);
        sb.append(", icOrderFlag=").append(icOrderFlag);
        sb.append(", produceUserId=").append(produceUserId);
        sb.append(", notifyOfflineFlag=").append(notifyOfflineFlag);
        sb.append(", notifyOfflineTime=").append(notifyOfflineTime);
        sb.append(", aliyun=").append(aliyun);
        sb.append(", ccid=").append(ccid);
        sb.append(", ccidFlag=").append(ccidFlag);
        sb.append(", minPower=").append(minPower);
        sb.append(", maxPower=").append(maxPower);
        sb.append(", minPowerTime=").append(minPowerTime);
        sb.append(", version=").append(version);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", manuId=").append(manuId);
        sb.append(", agentId=").append(agentId);
        sb.append(", salerId=").append(salerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}