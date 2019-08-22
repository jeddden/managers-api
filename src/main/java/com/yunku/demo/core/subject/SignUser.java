package com.yunku.demo.core.subject;

import com.yunku.demo.core.model.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 认证用户
 *
 * @author Jeddden
 * @create 2019-08-18 9:18
 */
public class SignUser implements Serializable {
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

    private String sessionKey;

    private List<Short> roleIdList= new ArrayList<>();

    private List<String> roleList= new ArrayList<>();

    private List<String> accessList = new ArrayList<>();// 用户可以访问的资源地址列表

    private List<Short> accessIdList= new ArrayList<>();// 用户可以访问的资源地址列表ID

    private List<Integer> agentIdList = new ArrayList<>();// 用户数据范围

    public List<Integer> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<Integer> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

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

    public List<Short> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<Short> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public List<String> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }

    public List<String> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<String> accessList) {
        this.accessList = accessList;
    }

    public List<Short> getAccessIdList() {
        return accessIdList;
    }

    public void setAccessIdList(List<Short> accessIdList) {
        this.accessIdList = accessIdList;
    }

    @Override
    public String toString() {
        return "SignUser{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", loginname='" + loginname + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", encrypt='" + encrypt + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", usertype=" + usertype +
                ", isdefault=" + isdefault +
                ", state=" + state +
                ", createdatetime=" + createdatetime +
                ", serverId=" + serverId +
                ", serverIdH5=" + serverIdH5 +
                ", alipayServerId=" + alipayServerId +
                ", clientFansId='" + clientFansId + '\'' +
                ", userFansId=" + userFansId +
                ", isBinding=" + isBinding +
                ", amount=" + amount +
                ", withdrawalAmount=" + withdrawalAmount +
                ", isContentUser=" + isContentUser +
                ", isDelete=" + isDelete +
                ", agentId=" + agentId +
                ", isAgentAdmin=" + isAgentAdmin +
                ", bankId=" + bankId +
                ", bankNum='" + bankNum + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", openid='" + openid + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", roleIdList=" + roleIdList +
                ", roleList=" + roleList +
                ", accessList=" + accessList +
                ", accessIdList=" + accessIdList +
                '}';
    }

    public static final SignUser toSignUser(User user){
        SignUser signUser = new SignUser();
        signUser.setServerId(user.getServerId());
        signUser.setAgentId(user.getAgentId());
        signUser.setId(user.getId());
        signUser.setUsertype(user.getUsertype());
        signUser.setName(user.getName());
        signUser.setAmount(user.getAmount());
        signUser.setIsAgentAdmin(user.getIsAgentAdmin());
        signUser.setState(user.getState());
        signUser.setParentId(user.getParentId());
        return signUser;
    }

}
