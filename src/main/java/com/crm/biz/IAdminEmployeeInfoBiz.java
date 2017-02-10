package com.crm.biz;

import com.crm.domain.ws.hr.EmployeeInfo;

/**
 * 个人信息管理
 * @author apeHx	
 *
 */
public interface IAdminEmployeeInfoBiz {
	/**
	 * 查看个人信息
	 * @param employeeId	员工ID
	 * @return	{@link com.crm.domain.ws.hr.EmployeeInfo}
	 */
	 EmployeeInfo selectEmployeeInfo(Integer employeeId);
	 
	 /**
	  * 用户登录
	  * @param userName	用户名
	  * @param password	密码
	  * @param ip 		登录IP
	  * @return	{@link com.crm.domain.ws.hr.EmployeeInfo}
	  */
	 EmployeeInfo login(String userName,String password,String ip);
	 
	 /**
	  * 修改密码
	  * @param oldPassword	原始密码
	  * @param password		新的密码
	  * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	  */
	 boolean updatePassword(String oldPassword,String password);
	 
	 /**
	  * 修改登录ID
	  * @param userName	登录ID
	  * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	  */
	 boolean updateUserName(String userName);
	 
	 /**
	  * 修改联系电话
	  * @param telPhone	联系电话
	  * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	  */
	 boolean updateTelPhone(String telPhone);
}
