package com.Spring.testJDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.tools.javac.code.Source;

@Configuration
public class TestDataSource {
	@Bean
	public DataSource getdatasource(){
		DruidDataSource souce= new DruidDataSource();
		souce.setDriverClassName("com.mysql.jdbc.Driver");
		souce.setUrl("jdbc:mysql://localhost/car");
		souce.setUsername("root");
		souce.setPassword("123123");
		souce.setInitialSize(2);
		souce.setMaxActive(10);
		return souce;
	}
	
	@Bean
	public JdbcTemplate getTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
}
