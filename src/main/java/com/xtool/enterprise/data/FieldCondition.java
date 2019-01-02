package com.xtool.enterprise.data;

public class FieldCondition<TValue> extends SearchCondition {
	public TValue[] values;

	public TValue[] getValues() {
		return values;
	}

	public void setValues(TValue[] values) {
		this.values = values;
	}
	
}
