package com.crm.domain.base;

import java.io.Serializable;

/**
 * 支付方式
 * @author apeHx
 *
 */
public class OrderPayType implements Serializable {
	private Integer id;		//ID
	private String name;	//支付名称
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
