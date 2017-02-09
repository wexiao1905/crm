package com.crm.biz;

import java.util.List;

import com.crm.domain.Power;

/**
 * 权限管理
 * @author apeHx
 *
 */
public interface IAdminPowerBiz {
	/**
	 * 查询权限列表	(包括下级权限)
	 * @return	{@link com.crm.domain.Power}
	 */
	List<Power> selectPowers();
	
	/**
	 * 查询下级权限列表
	 * @param powerId 	权限ID
	 * @return	{@link com.crm.domain.Power}
	 */
	List<Power> selectChildPowers(Integer powerId);
	
	/**
	 * 查询单个权限
	 * @param powerId	权限ID
	 * @return	{@link com.crm.domain.Power}
	 */
	Power selectPower(Integer powerId);
	
	/**
	 * 添加权限信息
	 * @param power	权限信息 {@link com.crm.domain.Power}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>	
	 */
	boolean insertPower(Power power);
	
	/**
	 * 修改权限信息
	 * @param power	权限信息 {@link com.crm.domain.Power}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>	
	 */
	boolean updatePower(Power power);
	
	/**
	 * 删除权限信息
	 * @param powerId	权限ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deletePower(Integer powerId);
}
