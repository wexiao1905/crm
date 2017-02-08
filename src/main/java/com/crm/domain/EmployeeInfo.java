package com.crm.domain;
/**
 * 个人信息
 * @author apehx
 *
 */
public class EmployeeInfo extends Logger {
	private Employee employee;	//员工信息
	private String username;	//登录ID
	private String password;	//登录密码
	private String telPhone;	//联系电话
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelPhone() {
		return telPhone;
	}
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
