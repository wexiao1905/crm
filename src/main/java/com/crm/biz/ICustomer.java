package com.crm.biz;

import com.crm.biz.condition.CustomerCondition;
import com.crm.domain.customer.Customer;
import com.crm.domain.ws.hr.Employee;
import com.crm.util.Pages;

/**
 * 客户资源管理
 * @author apeHx
 *
 */
public interface ICustomer {
	
	/**
	 * 查询客户资源
	 * @param condition	查询条件	{@link com.crm.biz.condition.CustomerCondition}
	 * @param page		分页信息	
	 * @return	{@linkplain com.crm.util.Pages}
	 */
	Pages<Customer> selectCustomers(CustomerCondition condition,Pages<Customer> page);
	
	/**
	 * 查看客户资源
	 * @param customerId	客户资源ID
	 * @return	{@link com.crm.domain.customer.Customer}
	 */
	Customer selectCustomer(Integer customerId);
	
	/**
	 * 添加客户资源
	 * @param customer	{@link com.crm.domain.customer.Customer}
	 * @return <ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertCustomer(Customer customer);
	
	/**
	 * 修改客户资源
	 * @param customer	{@link com.crm.domain.customer.Customer}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateCustomer(Customer customer);
	
	/**
	 * 分配客户资源
	 * @param customer 客户资源信息	{@link com.crm.domain.customer.Customer}
	 * @param employee 分配者	 {@link com.crm.domain.ws.hr.Employee}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean rantedCustomer(Customer customer,Employee employee);
	
	/**
	 * 删除客户资源
	 * @param customer	{@link com.crm.domain.customer.Customer}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteCustomer(Customer customer);
}
