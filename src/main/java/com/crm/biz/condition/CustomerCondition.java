package com.crm.biz.condition;

/**
 * 客户资源查询条件
 * @author apeHx
 *
 */
public class CustomerCondition {
	private String value;			//查询值
	private Integer selectType;		//查询方式	0:客户姓名	1:联系电话
	private Integer rantStatus; 	//分配状态	0:不限	1:未分配	2:已分配
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getSelectType() {
		return selectType;
	}
	public void setSelectType(Integer selectType) {
		this.selectType = selectType;
	}
	public Integer getRantStatus() {
		return rantStatus;
	}
	public void setRantStatus(Integer rantStatus) {
		this.rantStatus = rantStatus;
	}
}
