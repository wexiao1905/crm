package com.crm.domain.sell;

import java.util.Date;

import com.crm.domain.base.CompleteType;
import com.crm.domain.base.Logger;

/**
 * 竞争分析
 * @author apehx
 *
 */
public class Complete extends Logger {
	private Integer id;			//ID
	private String title;		//分析标题
	private Date completeDate;	//分析时间
	private CompleteType type;	//分析类型
	private String status;		//状态
	private String result;		//分析结果
	
	
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
	public Date getCompleteDate() {
		return completeDate;
	}
	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}
	public CompleteType getType() {
		return type;
	}
	public void setType(CompleteType type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
