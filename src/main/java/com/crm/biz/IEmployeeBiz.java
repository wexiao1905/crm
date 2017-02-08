package com.crm.biz;

import com.crm.domain.Employee;
import com.crm.util.Pages;

/**
 * 员工管理
 * @author apeHx
 *
 */
public interface IEmployeeBiz {
	/**
	 * 查询员工信息
	 * @param employeeName	员工名称
	 * @param page			分页信息	{@link com.crm.util.Pages}
	 * @return	{@link com.crm.domain.Employee}
	 */
	Pages<Employee> selectEmployees(String employeeName,Pages<Employee> page);
	
	/**
	 * 查询员工信息
	 * @param employeeId	员工ID
	 * @return	{@link com.crm.domain.Employee}
	 */
	Employee selectEmployee(Integer employeeId);
	
	/**
	 * 查询员工信息
	 * @param employeeCode	员工编码
	 * @return	{@link com.crm.domain.Employee}
	 */
	Employee selectEmployee(String employeeCode);
	
	/**
	 * 添加员工信息
	 * @param employee	员工信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertEmployee(Employee employee);
	
	/**
	 * 修改员工信息
	 * @param employee	员工信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateEmployee(Employee employee);
	
	/**
	 * 启用/禁用
	 * @param employee	员工信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean activeEmployee(Employee employee);
	
	/**
	 * 删除员工信息
	 * @param employeeId	员工ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteEmployee(Integer employeeId);
	
	/**
	 * 授权
	 * @param employee	员工信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean authorizeEmployee(Employee employee);
}
