package com.crm.biz;

import java.util.Date;

import com.crm.domain.sell.Complete;
import com.crm.util.Pages;

/**
 * 竞争管理
 * @author apeHx
 *
 */
public interface ISellCompleteBiz {
	/**
	 * 查询竞争分析
	 * @param completeDate	分析时间
	 * @param page			分页信息
	 * @return	{@link com.crm.util}
	 */
	Pages<Complete> selectCompletes(Date completeDate,Pages<Complete> page);
	
	/**
	 * 查看竞争分析
	 * @param completeId	竞争分析ID
	 * @return	{@link com.crm.domain.sell.Complete}
	 */
	Complete selectComplete(Integer completeId);
	
	/**
	 * 执行竞争分析
	 * @param complete	{@link com.crm.domain.sell.Complete}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean executeComplete(Complete complete);
	
	/**
	 * 修改竞争分析
	 * @param complete	{@link com.crm.domain.sell.Complete}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateComplete(Complete complete);
	
	/**
	 * 归档竞争分析
	 * @param complete	{@link com.crm.domain.sell.Complete}
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean keepedComplete(Complete complete);
}
