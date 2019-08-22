package com.yunku.demo.tool;

import com.yunku.demo.common.exception.AuthenticationException;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.config.properties.SessionProperties;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.tool.util.UUIDGenerator;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.yunku.demo.common.constant.ResponseStatusEnum.ENCRYPT_ERROR;
import static com.yunku.demo.common.constant.ResponseStatusEnum.TOKEN_VERIFICATION_FAILED;

/**
 * @author Jeddden
 * @create 2019-08-22 16:44
 */
@Component
public final class TokenUtils {

    public static final String TOKEN_BEARER = "Bearer ";

    public static final String TOKEN_HEAD = "YK";

    public static final String TOKEN_USERID_BEARER = "-";

    @Resource
    private RedisUtils redisUtils;

    @Resource
    private AESUtil aesUtil;

    @Resource
    private SessionProperties sessionProperties;

    public final void putIn(SignUser signUser) {
        StringBuilder builder = new StringBuilder(TOKEN_HEAD);
        builder.append(UUIDGenerator.getToken64()).append(TOKEN_USERID_BEARER).append(signUser.getId());
        String token = builder.toString();
        redisUtils.set(token, signUser, sessionProperties.getExpriationTime());
        try {
            token = aesUtil.encode(token);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(ENCRYPT_ERROR);
        }
        signUser.setSessionKey(TOKEN_BEARER + token);
    }

    public final String tokenDecode(String token){
        if (StringUtils.isEmpty(token) || !token.startsWith(TOKEN_BEARER)) {
            throw new AuthenticationException(TOKEN_VERIFICATION_FAILED);
        }
            String tokenCode = token.substring(7);
            String decode = "";
        try {
            decode = aesUtil.decode(tokenCode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(ENCRYPT_ERROR);
        }
        return decode;
    }
}
