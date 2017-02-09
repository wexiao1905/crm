package com.crm.config;

import javax.sql.DataSource;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Activiti配置
 * @author apeHx
 *
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class ActivitiConfig {
	
	@Bean(name="activiDataSource")	//数据源配置
	public DataSource dataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		//连接属性配置
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");							//JDBC驱动
		dataSource.setUrl("jdbc:mysql://localhost:3306/activiti?autoReconnect=true");	//Url连接路径
		dataSource.setUsername("root");													//用户名
		dataSource.setPassword("1905");													//密码
		
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
	
	@Qualifier("activiDataSource")
	@Bean(name="activitiTransactionManager")	//Activiti事物管理器配置
	public PlatformTransactionManager activitiTransactionManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean	//工作流引擎配置
	public ProcessEngine processEngine(@Qualifier("activiDataSource")DataSource dataSource,@Qualifier("activitiTransactionManager")PlatformTransactionManager transactionManager){
		SpringProcessEngineConfiguration configuration = new  SpringProcessEngineConfiguration();
		//Activiti数据源配置
		configuration.setDataSource(dataSource)																		//设置数据源
					 .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE)						//数据库检测
					 .setJobExecutorActivate(false);																//禁用Job执行器
		configuration.setTransactionManager(transactionManager);													//配置事物管理器
		configuration.setProcessDefinitionCacheLimit(10);															//限制流程缓存数量
		configuration.setDeploymentResources(ArrayUtils.toArray(new ClassPathResource("/process/*.bpmn20.xml")));	//打包流程资源
		
		//Activiti邮箱任务配置
		configuration.setMailServerHost("smtp.163.com");											//SMTP服务器地址
		configuration.setMailServerPort(25);														//SMTP服务器端口
		configuration.setMailServerUsername("weixiao1905@163.com");									//网易邮箱帐号
		configuration.setMailServerPassword("mtea1905");											//网易授权码
		
		return configuration.buildProcessEngine();													//创建工作流引擎
	}
	
	@Bean	//管理和控制发布包和流程定义的操作
	@Autowired(required=true)
	public RepositoryService repositoryService(ProcessEngine processEngine){
		return processEngine.getRepositoryService();
	}
	
	@Bean	//负责提供历史数据
	@Autowired(required=true) 
	public HistoryService historyService(ProcessEngine processEngine){
		return processEngine.getHistoryService();
	}
	
	@Bean	//负责启动一个流程定义的新实例
	@Autowired(required=true)
	public RuntimeService runtimeService(ProcessEngine processEngine){
		return processEngine.getRuntimeService();
	}
	
	@Bean	//提供任务相关的功能
	@Autowired(required=true)
	public TaskService taskService(ProcessEngine processEngine){
		return processEngine.getTaskService();
	}
	
	@Bean	//管理用户及群组
	@Autowired(required=true)
	public IdentityService identityService(ProcessEngine processEngine){
		return processEngine.getIdentityService();
	}
}
