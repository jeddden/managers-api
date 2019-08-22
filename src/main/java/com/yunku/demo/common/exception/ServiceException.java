package com.yunku.demo.common.exception;


import com.yunku.demo.common.constant.ResponseStatusEnum;

public class ServiceException extends RuntimeException {

    private int code;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(int code, String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(ResponseStatusEnum responseStatusEnum) {
        super(responseStatusEnum.getInfo());
        this.code = responseStatusEnum.getCode();
    }

    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
