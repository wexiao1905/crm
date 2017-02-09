package com.crm.domain.sell;

import com.crm.domain.Employee;
import com.crm.domain.base.Logger;
/**
 * 销售绩效
 * @author apeHx
 *
 */
public class Achievement extends Logger {
	private Integer id;			//ID
	private String code;		//绩效编码
	private Employee employee;	//员工
	private Integer level;		//绩效等级
	private String remarks;		//备注信息
	
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
