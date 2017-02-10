package com.crm.biz.condition;

import com.crm.domain.base.CustomerType;

/**
 * 客户价值查询条件
 * @author apeHx
 *
 */
public class CustomerValueCondition {
	private String customerName;		//客户姓名
	private CustomerType type;			//客户类型
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
}
