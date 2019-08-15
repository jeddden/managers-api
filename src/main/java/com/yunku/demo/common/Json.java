package com.yunku.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Json<T> implements java.io.Serializable {

	@ApiModelProperty(value = "true 成功， false 失败", position = 0)
	private boolean success = false;

	@ApiModelProperty(value = "提示信息", position = 1)
	private String msg = "";

	@ApiModelProperty(value = "数据", position = 2)
	private T obj = null;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
