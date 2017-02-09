package com.crm.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * 数据源配置
 * @author apeHx
 *
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass=true)
public class DataSourceConfig {
	
	@Bean
	@Primary	//数据源配置
	public DataSource dataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		//连接属性配置
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");		//JDBC驱动
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/crm");		//Url连接路径
		dataSource.setUsername("root");								//用户名
		dataSource.setPassword("1905");								//密码
		
		//连接线程配置
		dataSource.setMaxActive(150);						//最大连接数
		dataSource.setMaxIdle(20);							//最大空闲数
		dataSource.setMinIdle(5);							//最小空闲数
		dataSource.setInitialSize(30);						//初始化连接
		dataSource.setLogAbandoned(true);					//连接泄漏时输出Log
		dataSource.setRemoveAbandoned(true); 				//超时回收
		dataSource.setRemoveAbandonedTimeout(180);			//超时时间
		dataSource.setMaxWait(1000);						//超时等待时间
		dataSource.setTimeBetweenEvictionRunsMillis(1000);	//在空闲连接回收器线程运行期间休眠的时间值,以毫秒为单位.
		dataSource.setNumTestsPerEvictionRun(-1);			//在每次空闲连接回收器线程(如果有)运行时检查的连接数量
		dataSource.setMinEvictableIdleTimeMillis(1000);		//连接在池中保持空闲而不被空闲连接回收器线程(如果有)回收的最小时间值

		return dataSource;
	}
	
	@Bean
	@Primary	//事物管理器配置
	public PlatformTransactionManager transactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}
}
