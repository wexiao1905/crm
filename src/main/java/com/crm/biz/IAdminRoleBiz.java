package com.crm.biz;

import java.util.List;

import com.crm.domain.Role;

/**
 * 角色管理
 * @author apehx
 *
 */
public interface IAdminRoleBiz {
	
	/**
	 * 查询角色列表
	 * @param roleName	(code-角色编码,name-角色名称)
	 * @return 	{@link com.crm.domain.Role}
	 */
	List<Role> selectRoles(String roleName);
	
	/**
	 * 查询角色信息
	 * @param roleId	角色ID
	 * @return	{@link com.crm.domain.Role}
	 */
	Role selectRole(Integer roleId);
	
	/**
	 * 查询角色信息
	 * @param roleCode	角色编码
	 * @return	{@link com.crm.domain.Role}
	 */
	Role selectRole(String roleCode);
	
	/**
	 * 添加角色信息
	 * @param role		角色信息	{@link com.crm.domain.Role}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>	
	 */
	boolean insertRole(Role role);
	
	/**
	 * 修改角色信息
	 * @param role		角色信息	{@link com.crm.domain.Role}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>	
	 */
	boolean updateRole(Role role);
	
	/**
	 * 删除角色信息
	 * @param roleId	角色ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteRole(Integer roleId);
}
