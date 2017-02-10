package com.crm.domain.customer;

import com.crm.domain.base.CustomerStatus;
import com.crm.domain.base.CustomerType;
import com.crm.domain.base.Logger;
import com.crm.domain.sell.Caller;
import com.crm.domain.ws.hr.Employee;

/**
 * 客户资源信息
 * @author apeHx
 *
 */
public class Customer extends Logger {
	private Integer id;					//ID
	private Caller customerInfo;		//客户资源联系信息
	private CustomerType type;			//客户资源类型
	private CustomerStatus status;		//客户状态
	private Employee rantEmployee;		//分配给...
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Caller getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(Caller customerInfo) {
		this.customerInfo = customerInfo;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	public CustomerStatus getStatus() {
		return status;
	}
	public void setStatus(CustomerStatus status) {
		this.status = status;
	}
	public Employee getRantEmployee() {
		return rantEmployee;
	}
	public void setRantEmployee(Employee rantEmployee) {
		this.rantEmployee = rantEmployee;
	}
}
