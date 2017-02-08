package com.crm.message;

import com.crm.domain.Notify;

/**
 * 公告消息
 * @author apehx
 *
 */
public interface INotifyMessage {
	/**
	 * 全体通知
	 * @param notify	公告消息
	 * @return	{@link com.crm.domain.Notify}
	 */
	Notify everyOneNotify(Notify notify);
	
	/**
	 * 部门通知
	 * @param notify	公告消息
	 * @return	{@link com.crm.domain.Notify}
	 */
	Notify departmentNotify(Notify notify);
	
	/**
	 * 行政通知
	 * @param notify	公告消息
	 * @return	{@link com.crm.domain.Notify}
	 */
	Notify officerNotify(Notify notify);
	
	/**
	 * 个人通知
	 * @param notify	公告信息
	 * @return	{@link com.crm.domain.Notify}
	 */
	Notify personalNotify(Notify notify);
}
