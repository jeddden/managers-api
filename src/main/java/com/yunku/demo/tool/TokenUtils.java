package com.yunku.demo.tool;

import com.yunku.demo.common.exception.AuthenticationException;
import com.yunku.demo.common.exception.ServiceException;
import com.yunku.demo.config.properties.SessionProperties;
import com.yunku.demo.core.subject.SignUser;
import com.yunku.demo.tool.util.UUIDGenerator;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.yunku.demo.common.constant.ResponseStatusEnum.*;

/**
 * @author Jeddden
 * @create 2019-08-22 16:44
 */
@Component
public final class TokenUtils {

    private static final Logger logger = LoggerFactory.getLogger(TokenUtils.class);

    public static final String TOKEN_BEARER = "Bearer ";

    public static final String TOKEN_HEAD = "YK";

    public static final String TOKEN_USERID_BEARER = "-";

    private static ThreadLocal<String> tl = new ThreadLocal<>();

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

    public final SignUser checkToken(String token) {
        String tokenCode = tokenDecode(token);
        logger.info("====== token code ======>:" + tokenCode);
        put(tokenCode);
        Object o = redisUtils.get(tokenCode);
        if (o == null) {
            throw new AuthenticationException(TOKEN_EXPIRED);
        }
        SignUser signUser = ((SignUser) o);
        return signUser;
    }

    public final void flushTokenExprie(){
        redisUtils.set(get(),MySubjectContext.get(),sessionProperties.getExpriationTime());
    }

    public final void removeToken(){
        redisUtils.del(get());
    }

    public static final void put(String token){
        tl.set(token);
    }

    public static final String get(){
        return tl.get();
    }

    public static final void remove(){
        tl.remove();
    }
}
