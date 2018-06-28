package com.mybatis.resource;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@ComponentScan 不夹basepackage 代表扫描所有的包
@ComponentScan
//@MapperScan 扫描的是java 和resource中的 mapper对象，即StudentDao.java和StudentDao.xml
//注意在resource文件下的文件目录应是单独的的，
//如：在Java中包名为com.mybatis.dao ，在resource中应是 com -> mybatis -> dao三层目录
@MapperScan("com.mybatis.dao")//扫描mapper文件
@PropertySource("classpath:jdbc.properties")//加载资源文件
public class AppConfig {
	
	@Bean//数据源配置，
	public DataSource dataSource(Environment env) {
		String url = env.getProperty("jdbc.url");
		String username = env.getProperty("jdbc.username");
		String password = env.getProperty("jdbc.password");
		String driverCclassName = env.getProperty("jdbc.driverClassName");
		DriverManagerDataSource ds = 
				new DriverManagerDataSource(url,username,password);
		ds.setDriverClassName(driverCclassName);
		return ds;
	}
	@Bean//mybatis 会话工厂
	public SqlSessionFactoryBean sessionFactory(DataSource ds) {
		SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
		sf.setConfigLocation(new ClassPathResource("Mybatis-config.xml"));
		sf.setDataSource(ds);
		return sf;
	}
}
