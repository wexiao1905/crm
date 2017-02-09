package com.crm.biz;

import java.util.Date;

import com.crm.domain.sell.SellCount;
import com.crm.util.Pages;

/**
 * 销售分析
 * @author apeHx
 *
 */
public interface ISellCountBiz {
	/**
	 * 查询销售分析
	 * @param countDate	统计时间
	 * @param page		分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<SellCount> selectSellCounts(Date countDate,Pages<SellCount> page);
	
	/**
	 * 查看详情
	 * @param sellCountId	分析ID
	 * @return	{@link com.crm.domain.sell.SellCount}
	 */
	 SellCount selectSellCount(Integer sellCountId);
	 
	 /**
	  * 查看详情
	  * @param countDate	分析时间
	  * @return	{@link com.crm.domain.sell.SellCount}
	  */
	 SellCount selectSellCount(Date countDate);
}
