package com.crm.domain.base;

/**
 * 公告类型		(固定值)
 * @author apeHx
 *
 */
public class NotifyType {
	private Integer id;			//ID
	private String name;		//类型名称
	
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
