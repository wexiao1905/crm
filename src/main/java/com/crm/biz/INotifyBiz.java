package com.crm.biz;

import com.crm.domain.Notify;
import com.crm.util.Pages;

/**
 * 公告管理
 * @author apeHx
 *
 */
public interface INotifyBiz {
	/**
	 * 查询公告信息
	 * @param notifyTitle	公告标题
	 * @param page			分页信息	{@link com.crm.domain.Notify}
	 * @return	{@link com.crm.util.Pages} {@link com.crm.domain.Notify}
	 */
	Pages<Notify> selectNotifys(String notifyTitle,Pages<Notify> page);
	
	/**
	 * 查看公告信息
	 * @param notifyCode	公告编码
	 * @return	{@link com.crm.domain.Notify}
	 */
	Notify selectNotify(String notifyCode);
	
	/**
	 * 查看公告信息
	 * @param notifyId	公告ID
	 * @return	{@link com.crm.domain.Notify}
	 */
	Notify selectNotify(Integer notifyId);
	
	/**
	 * 删除公告信息
	 * @param notifyId	公告ID
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean deleteNotify(Integer notifyId);
	
	/**
	 * 添加公告信息
	 * @param notify	公告信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean insertNotify(Notify notify);
	
	/**
	 * 修改公告信息
	 * @param notify	公告信息
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateNotify(Notify notify);
}
