package com.crm.domain.base;

import java.io.Serializable;

/**
 * 竞争分析类型
 * @author apehx
 *
 */
public class CompleteType implements Serializable {
	private Integer id;		//ID
	private String name;	//竞争分析类型名称
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
