package com.crm.domain;

import java.util.List;

import com.crm.domain.base.Logger;
import com.crm.domain.ws.hr.Department;

/**
 * 角色信息
 * @author apeHx
 *
 */
public class Role extends Logger {
	private Integer id;				//ID
	private String code;			//角色编码
	private String name;			//角色名称
	private Department department;	//角色所属部门
	private List<Power> powers;		//权限列表
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
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
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
