package com.crm.biz;

import com.crm.domain.sell.Opportunity;
import com.crm.domain.ws.hr.Employee;
import com.crm.util.Pages;

/**
 * 机会管理
 * @author apeHx
 *
 */
public interface ISellOpportunityBiz {
	/**
	 * 查询机会
	 * @param opportunityTitle	机会标题
	 * @param page				分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<Opportunity> selectOpportunitys(String opportunityTitle,Pages<Opportunity> page);
	
	/**
	 * 查看机会
	 * @param opportunityId	机会ID
	 * @return	{@link com.crm.domain.sell.Opportunity}
	 */
	Opportunity selectOpportunity(Integer opportunityId);
	
	/**
	 * 添加机会
	 * @param opportunity	机会信息	{@link com.crm.domain.sell.Opportunity}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertOpportunity(Opportunity opportunity);
	
	/**
	 * 修改机会
	 * @param opportunity	机会信息	{@link com.crm.domain.sell.Opportunity}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateOpportunity(Opportunity opportunity);
	
	/**
	 * 分配机会
	 * @param opportunity	机会信息
	 * @param employee		分配者
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean rantedOpportunity(Opportunity opportunity,Employee employee);
	
	/**
	 * 
	 * @param opportunity	机会ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteOpportunity(Integer opportunity);
}
