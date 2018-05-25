package com.Sring.inject.annotion.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Spring.inject.annotion.In1;
import com.Spring.inject.annotion.In1Config;

//测试spring
//启动spring
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=In1Config.class)
//读取配置
public class TestIn1 {
	@Autowired(required=false)
	private In1 in1Impl;
	@Test
	public void test(){
		in1Impl.method1();
	}
}
