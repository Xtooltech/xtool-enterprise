package com.xtool.enterprise.data;

import java.io.Serializable;

public class PagedCondition implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3978278737652560925L;
	public int pageIndex;
	public int pageSize;
	public long total;
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}	
}
