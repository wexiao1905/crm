package com.crm.domain.sell;

import com.crm.domain.base.Logger;
/**
 * 联系人信息
 * @author apeHx
 *
 */
public class Caller extends Logger {
	private Integer id;			//ID
	private String code;		//编码
	private String name;		//联系人姓名
	private Integer sex;		//性别	1-男		2-女
	private String birthday;	//生日	
	private String phone;		//手机号码
	private String telWork;		//办公电话
	private String telHome;		//家庭电话
	private String email;		//邮箱
	private String address;		//联系地址
	private String remarks;		//备注
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTelWork() {
		return telWork;
	}
	public void setTelWork(String telWork) {
		this.telWork = telWork;
	}
	public String getTelHome() {
		return telHome;
	}
	public void setTelHome(String telHome) {
		this.telHome = telHome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
