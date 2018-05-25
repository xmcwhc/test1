package com.testSpring.test1;

public class Minstrel implements MinstrelI{
	public void before(){
		System.out.println("调用方法之前。。。。");
	}
	public void after(){
		System.out.println("调用方法之后。。。。");
	}
}
