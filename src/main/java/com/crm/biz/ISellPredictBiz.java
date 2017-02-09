package com.crm.biz;

import java.util.Date;

import com.crm.domain.Department;
import com.crm.domain.sell.Predict;
import com.crm.util.Pages;

/**
 * 销售预测管理
 * @author apehx
 *
 */
public interface ISellPredictBiz {
	
	/**
	 * 查询销售预测
	 * @param date	预测月份
	 * @param page	分页信息
	 * @return	{@link com.crm.util.Pages}
	 */
	Pages<Predict> selectPredicts(Date date,Pages<Predict> page);
	
	/**
	 * 查看销售预测
	 * @param predictId	预测ID
	 * @return	{@link com.crm.domain.sell.Predict}
	 */
	Predict selectPredict(Integer predictId);
	
	/**
	 * 执行销售预测
	 * @param predict	销售预测	{@link com.crm.domain.sell.Predict}
	 * @param filePath	预测数据文件地址
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean executePredict(Predict predict,String filePath);
	
	/**
	 * 查询部门员工人数
	 * @param department	部门信息
	 * @return
	 */
	Integer selectDepartmentEmployeeNum(Department department);
	
	/**
	 * 查询部门客户人数
	 * @param department	部门信息
	 * @return
	 */
	Integer selectDepartmentClientNum(Department department);
}
