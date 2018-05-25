package com.Spring.inject.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class In1Config {
	@Bean(name="b")
	public In1 in1(){
		return new In1Im();
	}
}
