package com.yunku.demo.common.respons;

import java.io.Serializable;

/**
 * @author Jeddden
 * @create 2019-06-14 17:23
 */
public class ResponseData<T> implements Serializable {
    public static final String DEFAULT_SUCCESS_MESSAGE = "seccess";
    public static final String DEFAULT_ERROR_MESSAGE = "fail";
    public static final Integer DEFAULT_SUCCESS_CODE = 200;
    public static final Integer DEFAULT_ERROR_CODE = 500;
    private Boolean success;
    private Integer status;
    private String message;
    private Object data;

    public ResponseData() {
    }

    public ResponseData(Boolean success, Integer status, String message, Object data) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static SuccessResponseData success() {
        return new SuccessResponseData();
    }

    public static SuccessResponseData success(Object object) {
        return new SuccessResponseData(object);
    }

    public static SuccessResponseData success(Integer status, String message, Object object) {
        return new SuccessResponseData(status, message, object);
    }

    public static ErrorResponseData error(String message) {
        return new ErrorResponseData(message);
    }

    public static ErrorResponseData error(Integer status, String message) {
        return new ErrorResponseData(status, message);
    }

    public static ErrorResponseData error(Integer status, String message, Object object) {
        return new ErrorResponseData(status, message, object);
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    public void setSuccess(final Boolean success) {
        this.success = success;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResponseData)) {
            return false;
        } else {
            ResponseData other = (ResponseData)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$success = this.getSuccess();
                    Object other$success = other.getSuccess();
                    if (this$success == null) {
                        if (other$success == null) {
                            break label59;
                        }
                    } else if (this$success.equals(other$success)) {
                        break label59;
                    }

                    return false;
                }

                Object this$status = this.getStatus();
                Object other$status = other.getStatus();
                if (this$status == null) {
                    if (other$status != null) {
                        return false;
                    }
                } else if (!this$status.equals(other$status)) {
                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseData;
    }

//    @Override
//    public int hashstatus() {
//        int PRIME = 1;
//        int result = 1;
//        Object $success = this.getSuccess();
//        result = result * 59 + ($success == null ? 43 : $success.hashstatus());
//        Object $status = this.getstatus();
//        result = result * 59 + ($status == null ? 43 : $status.hashstatus());
//        Object $message = this.getMessage();
//        result = result * 59 + ($message == null ? 43 : $message.hashstatus());
//        Object $data = this.getData();
//        result = result * 59 + ($data == null ? 43 : $data.hashstatus());
//        return result;
//    }

    @Override
    public String toString() {
        return "ResponseData(success=" + this.getSuccess() + ", status=" + this.getStatus() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }
}
