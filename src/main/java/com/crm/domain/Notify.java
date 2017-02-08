package com.crm.domain;

import com.crm.domain.base.NotifyType;

/**
 * 公告信息
 * @author apeHx
 *
 */
public class Notify extends Logger {
	private Integer id;					//ID
	private String title;				//公告标题
	private String context;				//公告内容
	private NotifyType notifyType;		//公告类型
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public NotifyType getNotifyType() {
		return notifyType;
	}
	public void setNotifyType(NotifyType notifyType) {
		this.notifyType = notifyType;
	}
}
