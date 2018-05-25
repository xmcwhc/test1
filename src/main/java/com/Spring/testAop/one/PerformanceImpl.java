package com.Spring.testAop.one;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

	public void perform(int num) {
		// TODO Auto-generated method stub
		System.out.println("开始表演啦。。。"+num+"个人");
	}

}
