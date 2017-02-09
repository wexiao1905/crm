package com.crm.biz;

import java.util.Map;

/**
 * 基础信息管理
 * @author apeHx
 *
 */
public interface IAdminParamValueBiz {
	/**
	 * 更新系统参数信息
	 * @param key	参数关键字
	 * @param value	参数值
	 * @return	<ul><li>true 成功</li><li>false 失败</li></ul>
	 */
	boolean updateParamValue(String key,String value);
	
	/**
	 * 查询系统参数列表
	 * @return
	 */
	Map<String,String> selectParamValues();
}
