package com.yunku.demo.common.respons;

import java.io.Serializable;


/**
 *
 * @Description: 符合前端习惯的结果封装
 * @author: Jedden
 * @date: 2018年7月10日 上午9:53:32
 */
public class ResponseResult<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String INFO_SUCCESS = "success";
	public static final String INFO_FAIL = "fail";
	public static final String MESSAGE_SUCCESS = "success";
	public static final String MESSAGE_FAIL = "fail";
	public static final Integer STATUS_SUCCESS = 200;
	public static final Integer STATUS_FAIL_DEFAULT = 0;// 默认错误状态码
	/**
	 * 状态码
	 */
	private int status;

	/**
	 * 提示
	 */
	private String message;

	/**
	 * 查询结果
	 */
	private T data;

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the info
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param info the info to set
	 */
	public void setMessage(String info) {
		this.message = info;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	public static ResponseResult getSuccessResponseResult() {
		ResponseResult o = new ResponseResult();
		o.setMessage(INFO_SUCCESS);
		o.setStatus(STATUS_SUCCESS);
		return o;
	}
	public static ResponseResult getSuccessResponseResult(Object data) {
		ResponseResult o = new ResponseResult();
		o.setData(data);
		o.setMessage(INFO_SUCCESS);
		o.setStatus(STATUS_SUCCESS);
		return o;
	}

    public static ResponseResult getSuccessResponseResult(String message) {
        ResponseResult o = new ResponseResult();
        o.setMessage(message);
        o.setStatus(STATUS_SUCCESS);
        return o;
    }

	public static ResponseResult getFailResponseResult() {
		ResponseResult o = new ResponseResult();
		o.setMessage(INFO_FAIL);
		o.setStatus(STATUS_FAIL_DEFAULT);
		return o;
	}

	public static ResponseResult getFailResponseResult(String message) {
		ResponseResult o = new ResponseResult();
		o.setMessage(message);
		o.setStatus(STATUS_FAIL_DEFAULT);
		return o;
	}
	public static ResponseResult getSaveObject() {
		ResponseResult o = new ResponseResult();
		o.setMessage("保存成功");
		o.setStatus(STATUS_SUCCESS);
		return o;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + this.status;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (obj == null){
            return false;}
        if (getClass() != obj.getClass()){
            return false;}
        ResponseResult other = (ResponseResult) obj;
        if (data == null) {
            if (other.data != null){
                return false;}
        } else if (!data.equals(other.data)){
            return false;}
        if (message == null) {
            if (other.message != null){
                return false;}
        } else if (!message.equals(other.message)){
            return false;}
        if (other.status != status){
            return false;}

        return true;
    }


    @Override
    public String toString() {
        return "ResponseResult [status=" + status + ", message=" + message +", data="
                + data + "]";
    }
}
