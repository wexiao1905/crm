package com.crm.biz;

import java.util.Date;

import com.crm.domain.sell.Plan;
import com.crm.util.Pages;

/**
 * 客户发展计划管理
 * @author apeHx
 *
 */
public interface ICustomerPlanBiz {
	/**
	 * 查询客户发展计划
	 * @param date	查询日期
	 * @param page	分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<Plan> selectCustomerPlans(Date date,Pages<Plan> page);
	
	/**
	 * 查看客户发展计划
	 * @param planId	客户发展计划ID
	 * @return	{@link com.crm.domain.sell.Plan}
	 */
	Plan selectCustomerPlan(Integer planId);
	
	/**
	 * 添加客户发展计划
	 * @param plan	客户发展计划信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertCustomerPlan(Plan plan);
	
	/**
	 * 修改客户发展计划
	 * @param plan	客户发展计划信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateCustomerPlan(Plan plan);
	
	/**
	 * 删除客户发展计划
	 * @param planId	客户发展计划ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteCustomerPlan(Integer planId);
}
