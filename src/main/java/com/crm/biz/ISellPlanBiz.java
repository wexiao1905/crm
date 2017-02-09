package com.crm.biz;

import java.util.Date;

import com.crm.domain.Employee;
import com.crm.domain.sell.Plan;
import com.crm.util.Pages;

/**
 * 销售计划
 * @author apeHx
 *
 */
public interface ISellPlanBiz {
	/**
	 * 查询计划
	 * @param planDate	计划月份
	 * @param page		分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<Plan> selectPlans(Date planDate,Pages<Plan> page);
	
	/**
	 * 查看计划
	 * @param planId	计划ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	Plan selectPlan(Integer planId);
	
	/**
	 * 添加计划
	 * @param plan	{@link com.crm.domain.sell.Plan}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertPlan(Plan plan);
	
	/**
	 * 更新计划
	 * @param plan	{@link com.crm.domain.sell.Plan}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updatePlan(Plan plan);
	
	/**
	 * 删除计划
	 * @param planId	计划ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deletePlan(Integer planId);
	
	/**
	 * 审核计划
	 * @param plan	{@link com.crm.domain.sell.Plan}
	 * @param employee	审核员工
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean checkedPlan(Plan plan,Employee employee);
}
