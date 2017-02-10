package com.crm.domain.customer;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 客户价值信息
 * @author apeHx
 *
 */
public class CustomerValue implements Serializable {
	private Integer id;				//ID
	private Customer customer;		//客户信息
	private Integer payNum;			//消费次数
	private BigDecimal payCount;	//消费总额
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getPayNum() {
		return payNum;
	}
	public void setPayNum(Integer payNum) {
		this.payNum = payNum;
	}
	public BigDecimal getPayCount() {
		return payCount;
	}
	public void setPayCount(BigDecimal payCount) {
		this.payCount = payCount;
	}	
}
