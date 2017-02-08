package com.crm.domain;

/**
 * 员工信息
 * @author apeHx
 *
 */
public class Employee extends Logger {
	private Integer id;				//ID
	private String code;			//编码
	private String name;			//姓名
	private	Integer sex;			//性别（1-男		2-女）
	private Integer status;			//状态（1-正常		2-禁用）
	private Department department;	//所属部门（null-综合部门）
	private Role role;				//角色身份（null-系统管理员）
	private String remarks;			//备注信息
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
