package com.yunku.demo.core.subject;

import com.yunku.demo.common.exception.AuthenticationException;
import com.yunku.demo.core.dao.AccessMapper;
import com.yunku.demo.core.dao.AgentMapper;
import com.yunku.demo.core.dao.RoleMapper;
import com.yunku.demo.core.dao.UserMapper;
import com.yunku.demo.core.model.Access;
import com.yunku.demo.core.model.Agent;
import com.yunku.demo.core.model.Role;
import com.yunku.demo.core.model.User;
import com.yunku.demo.core.service.AccessService;
import com.yunku.demo.tool.MySubjectContext;
import com.yunku.demo.tool.RedisUtils;
import com.yunku.demo.tool.util.ToolUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author Jeddden
 * @create 2019-08-18 12:31
 */
@Service
public class DefultSubject implements Subject {

    @Resource
    private RedisUtils redisUtils;

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private AccessMapper accessMapper;

    @Resource
    private AccessService accessService;

    @Resource
    private AgentMapper agentMapper;

    @Override
    public SignUser login(String account, String password) {
        User user = userMapper.seekByAccount(account);
        if (user != null) {
            String ps = ToolUtil.md5Hex(ToolUtil.md5Hex(password), user.getEncrypt());
            if (ps.equals(user.getPassword())) {
                return this.signPackage(user);
            } else {
                throw new AuthenticationException("Password error");
            }
        } else {
            throw new AuthenticationException("Account error");
        }
    }

    @Override
    public SignUser login(String openid) {
        User user = userMapper.getByOpenid(openid);
        if (user != null) {
            return this.signPackage(user);
        }
        return null;
    }

    @Override
    public SignUser getSignUser() {
        return MySubjectContext.get();
    }

    @Override
    public int logout() {
        return 0;
    }

    @Override
    public void checkRoles(String... roleIdentifiers) {

    }

    @Override
    public void checkRoles(Collection<String> roleIdentifiers) {

    }

    @Override
    public void checkPermissions(String... permissions) {

    }

    @Override
    public void checkPermissions(Collection<String> permissions) {

    }

    @Override
    public void checkPermissionById(Long... permissionIdentifiers) {

    }

    @Override
    public void checkPermissionById(Collection<Long> permissionIdentifiers) {

    }

    @Override
    public Boolean isManufacturer(SignUser user) {
        return user.getAgentId() == null ? false : user.getAgentId() == 0;
    }

    @Override
    public Boolean isMerchantAdmin() {
        return null;
    }

    @Override
    public Boolean checkLoginAuthentication(SignUser signUser) {
        List<Long> loginAuths = accessService.getLoginAccess();
        String accessStr = StringUtils.join(signUser.getAccessIdList(), ",");
        for (Long loginAuth : loginAuths) {
            if (accessStr.indexOf(loginAuth.toString()) >= 0) {
                return true;
            }
        }
//        loginAuths.retainAll(signUser.getAccessIdList());
//        if (loginAuths.isEmpty()) {
//            throw new RuntimeException("No login permissions");
//        }
        throw new AuthenticationException("No login permissions");
    }


    private SignUser signPackage(User user) {
        SignUser signUser = SignUser.toSignUser(user);
        List<Role> roles = roleMapper.selectByUserId(user.getId().toString());
        List<Access> accesses = accessMapper.selectByUserId(user.getId().toString());
        List<Agent> agents = agentMapper.selectAgentsById(user.getAgentId() == null ? 0 : user.getAgentId());
        if (CollectionUtils.isEmpty(roles) || CollectionUtils.isEmpty(accesses)) {
            throw new AuthenticationException("Missing roles or permissions information.");
        }
        for (Role role : roles) {
            signUser.getRoleList().add(role.getName());
            signUser.getRoleIdList().add(role.getId());
        }
        for (Access access : accesses) {
            signUser.getAccessList().add(access.getUrl());
            signUser.getAccessIdList().add(access.getId());
        }
        for (int i = 0; i < agents.size(); i++) {
            signUser.getAgentIdList().add(agents.get(i).getId());
        }
        return signUser;
    }
}
