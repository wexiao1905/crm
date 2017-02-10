package com.crm.biz;

import com.crm.biz.condition.CustomerValueCondition;
import com.crm.domain.customer.CustomerValue;
import com.crm.util.Pages;

/**
 * 客户价值管理
 * @author apeHx
 *
 */
public interface ICustomerValue {
	/**
	 * 查询客户价值
	 * @param condition	查询条件	{@link com.crm.biz.condition.CustomerValueCondition}
	 * @param page		分页信息
	 * @return	{@link com.crm.domain.customer.CustomerValue}	{@link com.crm.util.Pages}
	 */
	Pages<CustomerValue> selectCustomerValues(CustomerValueCondition condition,Pages<CustomerValue> page);
	
	/**
	 * 查看客户价值信息
	 * @param customerValueId	客户价值信息ID
	 * @return	{@link com.crm.domain.customer.CustomerValue}
	 */
	CustomerValue selectCustomerValue(Integer customerValueId);
	
	
	
	/**
	 * 添加客户价值信息
	 * @param customerValue	客户价值信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertCustomerValue(CustomerValue customerValue);
	
	/**
	 * 修改客户价值信息
	 * @param customerValue	客户价值信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateCustomerValue(CustomerValue customerValue);
	
	/**
	 * 删除客户价值信息
	 * @param customerValueId	客户价值信息ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteCustomerValue(Integer customerValueId);
}
