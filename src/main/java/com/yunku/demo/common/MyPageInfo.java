package com.yunku.demo.common;

/**
 * Copyright © 2018广州创致信息科技有限公司 All rights reserved.
 * 
 * @Description: 企业信息统计-信息统计记录分页对象
 * @author: ShuJiang
 * @date: 2018年7月23日15:04:23
 */
public class MyPageInfo {
	// 当前页
	private int pageNum=1 ;
	// 每页有多少条数据
	private int pageSize=20 ;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "MyPageInfo{" +
				"pageNum=" + pageNum +
				", pageSize=" + pageSize +
				'}';
	}
}
