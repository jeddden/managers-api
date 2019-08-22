package com.yunku.demo.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_user
 * @author 
 */
public class User implements Serializable {
    private Short id;

    private Integer parentId;

    private String loginname;

    private String name;

    private String password;

    private String encrypt;

    private Byte sex;

    private Byte age;

    private Byte usertype;

    private Byte isdefault;

    private Byte state;

    private Date createdatetime;

    private Long serverId;

    private Long serverIdH5;

    private Long alipayServerId;

    private String clientFansId;

    /**
     * 管理员的粉丝id号
     */
    private Long userFansId;

    private Integer isBinding;

    private Long amount;

    /**
     * 累计提现金额
     */
    private Long withdrawalAmount;

    private Integer isContentUser;

    private Integer isDelete;

    /**
     * 贴牌商id
     */
    private Integer agentId;

    /**
     * 是否属于商户的管理员，0为否，1为是
     */
    private Integer isAgentAdmin;

    private Integer bankId;

    /**
     * 银行卡号
     */
    private String bankNum;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    private String openid;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Byte getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Byte isdefault) {
        this.isdefault = isdefault;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getServerIdH5() {
        return serverIdH5;
    }

    public void setServerIdH5(Long serverIdH5) {
        this.serverIdH5 = serverIdH5;
    }

    public Long getAlipayServerId() {
        return alipayServerId;
    }

    public void setAlipayServerId(Long alipayServerId) {
        this.alipayServerId = alipayServerId;
    }

    public String getClientFansId() {
        return clientFansId;
    }

    public void setClientFansId(String clientFansId) {
        this.clientFansId = clientFansId;
    }

    public Long getUserFansId() {
        return userFansId;
    }

    public void setUserFansId(Long userFansId) {
        this.userFansId = userFansId;
    }

    public Integer getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(Integer isBinding) {
        this.isBinding = isBinding;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(Long withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Integer getIsContentUser() {
        return isContentUser;
    }

    public void setIsContentUser(Integer isContentUser) {
        this.isContentUser = isContentUser;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getIsAgentAdmin() {
        return isAgentAdmin;
    }

    public void setIsAgentAdmin(Integer isAgentAdmin) {
        this.isAgentAdmin = isAgentAdmin;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEncrypt() == null ? other.getEncrypt() == null : this.getEncrypt().equals(other.getEncrypt()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getIsdefault() == null ? other.getIsdefault() == null : this.getIsdefault().equals(other.getIsdefault()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCreatedatetime() == null ? other.getCreatedatetime() == null : this.getCreatedatetime().equals(other.getCreatedatetime()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getServerIdH5() == null ? other.getServerIdH5() == null : this.getServerIdH5().equals(other.getServerIdH5()))
            && (this.getAlipayServerId() == null ? other.getAlipayServerId() == null : this.getAlipayServerId().equals(other.getAlipayServerId()))
            && (this.getClientFansId() == null ? other.getClientFansId() == null : this.getClientFansId().equals(other.getClientFansId()))
            && (this.getUserFansId() == null ? other.getUserFansId() == null : this.getUserFansId().equals(other.getUserFansId()))
            && (this.getIsBinding() == null ? other.getIsBinding() == null : this.getIsBinding().equals(other.getIsBinding()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getWithdrawalAmount() == null ? other.getWithdrawalAmount() == null : this.getWithdrawalAmount().equals(other.getWithdrawalAmount()))
            && (this.getIsContentUser() == null ? other.getIsContentUser() == null : this.getIsContentUser().equals(other.getIsContentUser()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getIsAgentAdmin() == null ? other.getIsAgentAdmin() == null : this.getIsAgentAdmin().equals(other.getIsAgentAdmin()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankNum() == null ? other.getBankNum() == null : this.getBankNum().equals(other.getBankNum()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEncrypt() == null) ? 0 : getEncrypt().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getIsdefault() == null) ? 0 : getIsdefault().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCreatedatetime() == null) ? 0 : getCreatedatetime().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getServerIdH5() == null) ? 0 : getServerIdH5().hashCode());
        result = prime * result + ((getAlipayServerId() == null) ? 0 : getAlipayServerId().hashCode());
        result = prime * result + ((getClientFansId() == null) ? 0 : getClientFansId().hashCode());
        result = prime * result + ((getUserFansId() == null) ? 0 : getUserFansId().hashCode());
        result = prime * result + ((getIsBinding() == null) ? 0 : getIsBinding().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getWithdrawalAmount() == null) ? 0 : getWithdrawalAmount().hashCode());
        result = prime * result + ((getIsContentUser() == null) ? 0 : getIsContentUser().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getIsAgentAdmin() == null) ? 0 : getIsAgentAdmin().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankNum() == null) ? 0 : getBankNum().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", loginname=").append(loginname);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", usertype=").append(usertype);
        sb.append(", isdefault=").append(isdefault);
        sb.append(", state=").append(state);
        sb.append(", createdatetime=").append(createdatetime);
        sb.append(", serverId=").append(serverId);
        sb.append(", serverIdH5=").append(serverIdH5);
        sb.append(", alipayServerId=").append(alipayServerId);
        sb.append(", clientFansId=").append(clientFansId);
        sb.append(", userFansId=").append(userFansId);
        sb.append(", isBinding=").append(isBinding);
        sb.append(", amount=").append(amount);
        sb.append(", withdrawalAmount=").append(withdrawalAmount);
        sb.append(", isContentUser=").append(isContentUser);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", agentId=").append(agentId);
        sb.append(", isAgentAdmin=").append(isAgentAdmin);
        sb.append(", bankId=").append(bankId);
        sb.append(", bankNum=").append(bankNum);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", openid=").append(openid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}