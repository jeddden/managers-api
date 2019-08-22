package com.yunku.demo.common.exception;

import com.yunku.demo.common.constant.ResponseStatusEnum;

/**
 * 权限验证异常
 *
 * @author Jeddden
 * @create 2019-08-21 16:54
 */
public class AuthenticationException extends ServiceException {

    public static final int default_status_code = 401;
    /**
     * Creates a new AuthenticationException.
     */
    public AuthenticationException() {
        super();
    }

    /**
     * Constructs a new AuthenticationException.
     *
     * @param message the reason for the exception
     */
    public AuthenticationException(String message) {
        super(default_status_code, message);
    }

    /**
     * Constructs a new AuthenticationException.
     *
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public AuthenticationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new AuthenticationException.
     *
     * @param message the reason for the exception
     * @param cause   the underlying Throwable that caused this exception to be thrown.
     */
    public AuthenticationException(String message, Throwable cause) {
        super(default_status_code, message, cause);
    }

    public AuthenticationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public AuthenticationException(ResponseStatusEnum responseStatusEnum) {
        super(responseStatusEnum);
    }
}
