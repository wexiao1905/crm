package com.crm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作记录
 * @author apeHx
 *
 */
public class Logger implements Serializable {
	private Employee employee;		//操作员工
	private Date createDate;		//操作时间	默认为当前系统时间
	private String remarks;			//操作备注
	
	public Logger() {
		this.createDate = new Date();
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
