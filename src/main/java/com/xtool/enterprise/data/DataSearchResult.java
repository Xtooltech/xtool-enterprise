package com.xtool.enterprise.data;

import java.util.List;

public class DataSearchResult<TData> extends DataSearchCondition {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 951583560720690358L;
	public List<TData> data;

	public List<TData> getData() {
		return data;
	}

	public void setData(List<TData> data) {
		this.data = data;
	}
	
}
