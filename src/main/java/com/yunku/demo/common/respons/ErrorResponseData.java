package com.yunku.demo.common.respons;

import com.yunku.demo.common.constant.ResponseStatusEnum;

/**
 * @author Jeddden
 * @create 2019-06-14 17:27
 */
public class ErrorResponseData extends ResponseData {
    private String exceptionClazz;

    public ErrorResponseData(ResponseStatusEnum statusEnum) {
        super(false, statusEnum.getCode(), statusEnum.getInfo(), null);
    }

    public ErrorResponseData(String message) {
        super(false, ResponseData.DEFAULT_ERROR_CODE, message, (Object) null);
    }

    public ErrorResponseData(Integer code, String message) {
        super(false, code, message, (Object) null);
    }

    public ErrorResponseData(Integer code, String message, Object object) {
        super(false, code, message, object);
    }

    public String getExceptionClazz() {
        return this.exceptionClazz;
    }

    public void setExceptionClazz(final String exceptionClazz) {
        this.exceptionClazz = exceptionClazz;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ErrorResponseData)) {
            return false;
        } else {
            ErrorResponseData other = (ErrorResponseData) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$exceptionClazz = this.getExceptionClazz();
                Object other$exceptionClazz = other.getExceptionClazz();
                if (this$exceptionClazz == null) {
                    if (other$exceptionClazz != null) {
                        return false;
                    }
                } else if (!this$exceptionClazz.equals(other$exceptionClazz)) {
                    return false;
                }

                return true;
            }
        }
    }

    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof ErrorResponseData;
    }

    @Override
    public int hashCode() {
        int PRIME = 1;
        int result = 1;
        Object $exceptionClazz = this.getExceptionClazz();
        result = result * 59 + (($exceptionClazz == null) ? 43 : $exceptionClazz.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return  "ErrorResponseData(exceptionClazz=" + this.getExceptionClazz() + ")" +super.toString();
    }
}