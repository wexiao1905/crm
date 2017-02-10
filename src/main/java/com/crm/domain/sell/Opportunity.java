package com.crm.domain.sell;

import java.util.Date;

import com.crm.domain.base.Logger;
/**
 * 机会信息
 * @author apehx
 *
 */
import com.crm.domain.base.OpportunityType;
import com.crm.domain.ws.hr.Employee;
public class Opportunity extends Logger {
	private Integer id;				//ID
	private String code;			//编码
	private String title;			//机会标题
	private OpportunityType type;	//机会类型 	
	private String content;			//机会内容
	private String remarks;			//备注
	private Date createTime;		//创建时间
	private Employee dealEmployee;	//录入人
	private	Employee rantEmployee;	//分配给...
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public OpportunityType getType() {
		return type;
	}
	public void setType(OpportunityType type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Employee getDealEmployee() {
		return dealEmployee;
	}
	public void setDealEmployee(Employee dealEmployee) {
		this.dealEmployee = dealEmployee;
	}
	public Employee getRantEmployee() {
		return rantEmployee;
	}
	public void setRantEmployee(Employee rantEmployee) {
		this.rantEmployee = rantEmployee;
	}
}
