package com.Sring.testAOP.one.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Spring.testAop.one.Config;

import com.Spring.testAop.one.Encoreable;
import com.Spring.testAop.one.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
public class Test1 {
	@Autowired
	private Performance performance;
	@Autowired
	private Encoreable encoIntro;

	@Test
	public void test1(){
		performance.perform(5);
		encoIntro.peromanceEn();
	}
}
