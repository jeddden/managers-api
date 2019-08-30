package com.yunku.demo.core.subject;

import java.util.Collection;

/**
 * 权限相关
 *
 * @author Jeddden
 * @create 2019-08-16 14:43
 */
public interface Subject  {

    // 记录openid
//    int recordOpenId(Short id,String openid);

    /**
     * 账号密码登陆
     * @param account
     * @param password
     * @return
     */
    SignUser login(String account,String password);

    /**
     * 微信快速登陆
     * @param openid
     * @return
     */
    SignUser login(String openid);

    /**
     * 当前登陆用户
     * @return
     */
    SignUser getSignUser();

    /**
     * 登出
     * @return
     */
    int logout();

    /**
     * 检查角色id
     * @param roleIdentifiers
     */
    void checkRoles(String... roleIdentifiers);

    void checkRoles(Collection<String> roleIdentifiers);

    /**
     * 检查权限url
     * @param permissions
     */
    void checkPermissions(String ... permissions);

    void checkPermissions(Collection<String> permissions);

    /**
     * 检查权限id
     * @param permissionIdentifiers
     */
    void checkPermissionById(Long... permissionIdentifiers);

    void checkPermissionById(Collection<Long> permissionIdentifiers);

    /**
     * 是否是生产商
     * @return
     */
    Boolean isManufacturer(SignUser user);

    /**
     * 是否是商户管理员
     * @return
     */
    Boolean isMerchantAdmin();

    /**
     * 检查登陆权限
     * @return
     */
    Boolean checkLoginAuthentication(SignUser signUser);

}
