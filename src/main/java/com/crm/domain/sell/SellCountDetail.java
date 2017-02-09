package com.crm.domain.sell;

import java.math.BigDecimal;

import com.crm.domain.Department;
import com.crm.domain.base.Logger;

/**
 * 销售统计详情
 * @author apehx
 *
 */
public class SellCountDetail extends Logger {
	private Integer id;					//ID
	private Department department;		//部门
	private BigDecimal count;			//销售金额
	private Float monthOnMonth;			//同比
	private Float monthOnNextMonth;		//环比
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public BigDecimal getCount() {
		return count;
	}
	public void setCount(BigDecimal count) {
		this.count = count;
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
}
