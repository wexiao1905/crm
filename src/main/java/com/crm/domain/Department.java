package com.crm.domain;

/**
 * 部门信息
 * @author apeHx 
 *
 */
public class Department extends Logger {
	private Integer id;			//ID
	private String code;		//编码
	private String simpleName;	//简称
	private String fullName;	//全称
	private String introduce;	//简介
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSimpleName() {
		return simpleName;
	}
	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
}
