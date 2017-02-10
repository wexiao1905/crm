package com.crm.domain.sell;

import java.util.Date;

import com.crm.domain.base.Logger;
import com.crm.domain.base.PlanType;
import com.crm.domain.ws.hr.Employee;

/**
 * 销售计划
 * @author apeHx
 *
 */
public class Plan extends Logger {
	private Integer id;			//ID
	private String code;		//编码
	private Date planMonth;		//计划月份
	private String status;		//计划状态
	private Employee employee;	//计划人
	private String content;		//计划内容
	private PlanType type;		//计划类型
	
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
	public Date getPlanMonth() {
		return planMonth;
	}
	public void setPlanMonth(Date planMonth) {
		this.planMonth = planMonth;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
