package com.jt.vo;

public class SysResult {
	private Integer status;
	private String msg;
	private Object dbData;
	public SysResult() {
		System.out.println("我是无参构造");
	}
	public SysResult(Integer status, String msg, Object dbData) {
		super();
		this.status = status;
		this.msg = msg;
		this.dbData = dbData;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getDbData() {
		return dbData;
	}
	public void setDbData(Object dbData) {
		this.dbData = dbData;
	}
	
}
