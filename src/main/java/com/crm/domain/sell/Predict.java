package com.crm.domain.sell;

import java.util.Date;

import com.crm.domain.Department;
import com.crm.domain.base.Logger;
/**
 * 销售预测
 * @author apeHx
 *
 */
public class Predict extends Logger {
	private Integer id;				//ID
	private String title;			//预测结果标题
	private Date date;				//预测时间
	private Department department;	//预测部门
	private Integer employeeNum;	//部门员工数量
	private Integer clientNum;		//部门客户数量
	private String result;			//预测结果
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Integer getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(Integer employeeNum) {
		this.employeeNum = employeeNum;
	}
	public Integer getClientNum() {
		return clientNum;
	}
	public void setClientNum(Integer clientNum) {
		this.clientNum = clientNum;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
