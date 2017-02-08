package com.crm.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页工具
 * @author apeHx
 *
 */
@SuppressWarnings("serial")
public class Pages<T> implements Serializable {
	private Integer pageNo=1;						//当前页索引
	private Integer pageCount=0;					//总记录数
	private Integer pageSize=10;					//页面显示数目
	private Integer pageTotal=0;					//总页数
	private List<T> datas=new ArrayList<T>();		//数据集合
	
	/**
	 * 构建分页
	 * @param pageNo	//当前页索引		默认1
	 * @param pageCount	//总记录数		默认0
	 * @param pageSize	//页面显示数目 	默认10
	 * @param datas 	//分页后的数据信息
	 */
	public Pages(Integer pageNo,Integer pageCount,Integer pageSize) {
		//初始化参数信息
		this.pageNo = pageNo != null ? pageNo : this.pageNo;
		this.pageCount = pageCount != null ? pageCount : this.pageCount;
		this.pageSize = pageSize != null ? pageSize : this.pageSize;
		this.datas = datas != null ? datas : this.datas;
		
		//计算总页数
		this.pageTotal = (this.pageCount % this.pageSize) != 0 ? (this.pageCount / this.pageSize) : (this.pageCount / this.pageSize + 1);
	}
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}
}
