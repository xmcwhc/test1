package com.Spring.testInject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	public Quest quest(){
		return new BraveQuest();
	}
}
