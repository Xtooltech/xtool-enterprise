package com.xtool.enterprise;

/**
 * rest-full apis response data structure.
 * @author lee
 *
 * @param <TData> type of data.
 */
public class RespState <TData> {
	
	private int code;
	private String msg;
	private TData data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public TData getData() {
		return data;
	}
	public void setData(TData data) {
		this.data = data;
	}
}