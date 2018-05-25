package com.Spring.testTemplat;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Employee {
	private String name;
	private String id;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Employee getByID(){
		return jdbcTemplate.queryForObject("", new RowMapper<Employee>(){


			public Employee mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
		},id);
		
	}
	
	
}
