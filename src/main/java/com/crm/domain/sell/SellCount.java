package com.crm.domain.sell;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.crm.domain.base.Logger;
/**
 * 销售统计
 * @author apeHx
 *
 */
public class SellCount extends Logger {
	private Integer id;							//ID
	private BigDecimal count;					//销售金额
	private Date date;							//月份
	private Float monthOnMonth;					//同比
	private Float monthOnNextMonth;				//环比
	private List<SellCountDetail> countDetail;	//统计详情
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getCount() {
		return count;
	}
	public void setCount(BigDecimal count) {
		this.count = count;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getMonthOnMonth() {
		return monthOnMonth;
	}
	public void setMonthOnMonth(Float monthOnMonth) {
		this.monthOnMonth = monthOnMonth;
	}
	public Float getMonthOnNextMonth() {
		return monthOnNextMonth;
	}
	public void setMonthOnNextMonth(Float monthOnNextMonth) {
		this.monthOnNextMonth = monthOnNextMonth;
	}
	public List<SellCountDetail> getCountDetail() {
		return countDetail;
	}
	public void setCountDetail(List<SellCountDetail> countDetail) {
		this.countDetail = countDetail;
	}
}
