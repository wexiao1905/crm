package com.crm.config;

import java.util.concurrent.TimeUnit;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.Ssl;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
/**
 * 服务器配置
 * @author apeHx
 * @see org.springframework.boot.context.embedded.EmbeddedServletContainerFactory
 */
@Configuration
public class ServerConfig {
	
	@Bean //Tomcat Servlet连接器配置 {@see http://tomcat.apache.org/tomcat-5.5-doc/catalina/docs/api/org/apache/catalina/connector/Connector.html}
	public Connector httpConnector(){
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");		//请求协议
		connector.setPort(8080);			//端口
		connector.setSecure(false);			//Cookie传递方式
		connector.setRedirectPort(8181);	//跳转端口
		return connector;
	}
	
	@Bean //Tomcat Servlet容器配置 {@see http://tomcat.apache.org/tomcat-5.5-doc/catalina/docs/api/org/apache/catalina/deploy/SecurityConstraint.html}
	public EmbeddedServletContainerFactory servletContainerFactory(){
		
		//HTTP 跳转 HTTPS
		TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = new TomcatEmbeddedServletContainerFactory(){
			@Override
			protected void postProcessContext(Context context) {
				SecurityConstraint securityConstraint = new SecurityConstraint();	//安全约束
				securityConstraint.setUserConstraint("CONFIDENTIAL");				//设置此安全约束的用户数据约束
				
				SecurityCollection collection = new SecurityCollection();			//安全限制
				collection.addPattern("/*");										//限制所有请求
				
				securityConstraint.addCollection(collection);						//添加安全限制
				
				context.addConstraint(securityConstraint);							//添加安全约束
			}
		};
		
		//设置连接器
		tomcatEmbeddedServletContainerFactory.addAdditionalTomcatConnectors(httpConnector());
		
		//端口
		tomcatEmbeddedServletContainerFactory.setPort(8181);
		
		//错误页面 {@see http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/http/HttpStatus.html}
		tomcatEmbeddedServletContainerFactory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html"));				//404
		tomcatEmbeddedServletContainerFactory.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html"));	//500
		tomcatEmbeddedServletContainerFactory.addErrorPages(new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/error/405.html"));		//405
		tomcatEmbeddedServletContainerFactory.addErrorPages(new ErrorPage(HttpStatus.PRECONDITION_FAILED, "/error/412.html"));		//412
		tomcatEmbeddedServletContainerFactory.addErrorPages(new ErrorPage(HttpStatus.REQUEST_TIMEOUT, "/error/408.html"));			//408
		
		//SSL安全证书 {@see http://tomhat.iteye.com/blog/2087673}
		Ssl ssl = new Ssl();
		ssl.setKeyStore("tomcat.keystore"); 	//证书位置
		ssl.setKeyStoreType("JKS");				//证书类型
		ssl.setKeyPassword("123456");			//别名密码
		ssl.setKeyAlias("tomcat");				//证书别名
		ssl.setProtocol("TLS");					//证书协议
		ssl.setEnabled(true);					//是否启用证书
		tomcatEmbeddedServletContainerFactory.setSsl(ssl);
		
		//Session数据保存时间
		tomcatEmbeddedServletContainerFactory.setSessionTimeout(30, TimeUnit.MINUTES);	//30分钟之后过期
		return tomcatEmbeddedServletContainerFactory;
	}
	
	
}
