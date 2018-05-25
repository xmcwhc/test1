package com.Spring.testJDBC.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Spring.testJDBC.TestDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestDataSource.class)
public class Test1 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Test
	public void test(){
		jdbcTemplate.update("insert into user(username,password) values(?,?)", "1","1");
	}
}
