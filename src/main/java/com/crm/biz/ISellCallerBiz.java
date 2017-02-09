package com.crm.biz;

import com.crm.domain.sell.Caller;
import com.crm.util.Pages;

/**
 * 联系人管理
 * @author apehx
 *
 */
public interface ISellCallerBiz {
	/**
	 * 查询联系人信息
	 * @param callerName	联系人姓名
	 * @param page			分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<Caller> selectCallers(String callerName,Pages<Caller> page);
	
	/**
	 * 查看联系人信息
	 * @param callerId	联系人ID
	 * @return	{@link com.crm.domain.sell.Caller}
	 */
	Caller selectCaller(Integer callerId);
	
	/**
	 * 添加联系人信息
	 * @param caller	{@link com.crm.domain.sell.Caller}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertCaller(Caller caller);
	
	/**
	 * 修改联系人信息
	 * @param caller	{@link com.crm.domain.sell.Caller}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateCaller(Caller caller);
	
	/**
	 * 删除联系人信息
	 * @param callerId	联系人ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteCaller(Integer callerId);
}
