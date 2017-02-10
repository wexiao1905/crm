package com.crm.domain.base;

import java.io.Serializable;

/**
 * 计划类型
 * @author apeHx
 *
 */
public class PlanType implements Serializable {
	private Integer id;		//ID
	private String name;	//计划类型名称
	
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
