package com.crm.biz;

import java.util.List;

import com.crm.domain.Department;

/**
 * 组织结构 管理
 * @author apeHx
 *
 */
public interface IAdminDepartmentBiz {
	/**
	 * 查询组织结构信息
	 * @param departmentName	组织结构名称(simpleName-简称查询 ，fullName-全称查询)
	 * @return	满足条件的组织结构列表	{@link com.crm.domain.Department }
	 */
	List<Department> selectDepartments(String departmentName);
	
	/**
	 * 查询组织结构信息
	 * @param code	组织结构编码
	 * @return	组织结构信息	{@link com.crm.domain.Department }
	 */
	Department selectDepartment(String code);
	
	/**
	 * 查询组织结构信息
	 * @param id	组织结构ID
	 * @return	组织结构信息	{@link com.crm.domain.Department }
	 */
	Department selectDepartment(Integer id);
	
	/**
	 * 添加组织结构信息			
	 * @param department	组织结构信息 {@link com.crm.domain.Department }
	 * @return 	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertDepartment(Department department);
	
	/**
	 * 修改组织结构信息
	 * @param department	组织结构信息 {@link com.crm.domain.Department }
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateDepartment(Department department);
	
	/**
	 * 删除组织结构信息
	 * @param departmentId	组织结构ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteDepartment(Integer departmentId);
}
