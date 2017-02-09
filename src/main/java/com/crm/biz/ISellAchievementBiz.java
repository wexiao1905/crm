package com.crm.biz;

import com.crm.domain.sell.Achievement;
import com.crm.util.Pages;

/**
 * 销售绩效管理
 * @author apeHx
 *
 */
public interface ISellAchievementBiz {
	/**
	 * 查询销售绩效
	 * @param employeeName	员工姓名
	 * @param page			分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<Achievement> selectAchievements(String employeeName,Pages<Achievement> page);
	
	/**
	 * 查看销售绩效
	 * @param achievementId	销售绩效ID
	 * @return	{@link com.crm.domain.sell.Achievement}
	 */
	Achievement selectAchievement(Integer achievementId);
	
	/**
	 * 添加销售绩效信息
	 * @param achievement	销售绩效信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertAchievement(Achievement achievement);
	
	/**
	 * 修改销售绩效信息
	 * @param achievement	销售绩效信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateAchievement(Achievement achievement);
	
	/**
	 * 删除销售绩效信息
	 * @param achievementId	销售绩效ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteAchievement(Integer achievementId);
	
}
