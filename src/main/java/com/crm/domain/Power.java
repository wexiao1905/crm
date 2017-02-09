package com.crm.domain;

import java.util.List;

import com.crm.domain.base.Logger;

/**
 * 权限信息
 * @author apeHx
 *
 */
public class Power extends Logger {
	private Integer id;			//ID
	private String name;		//权限名称
	private String url;			//权限连接url
	private List<Power> powers;	//下级权限列表
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
