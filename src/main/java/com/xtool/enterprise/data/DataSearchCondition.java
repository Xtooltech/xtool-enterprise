package com.xtool.enterprise.data;

public class DataSearchCondition extends PagedCondition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4232033438375775949L;
	public SortField[] sortFields;
	public SortField[] getSortFields() {
		return sortFields;
	}
	public void setSortFields(SortField[] sortFields) {
		this.sortFields = sortFields;
	}
}
