package com.yunku.demo.common.exception;

public class MyServiceException extends RuntimeException {
    private static final long serialVersionUID = -314355855713474773L;

    public MyServiceException() {
    }

    public MyServiceException(AbstractBaseExceptionEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyServiceException(int code, String message) {
        super(message);
    }

    public MyServiceException(Throwable cause) {
        super(cause);
    }

    public MyServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
