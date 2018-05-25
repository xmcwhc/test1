package com.Spring.testAop.one;

import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;
@Aspect
@Component
public class Audience {
	@Pointcut("execution(* *.perform(int)) && args(nums)")
	public void peformance(int nums){
		
	}
	/*@Before("execution(* *.*.perform(..))")
	public void before(){
		System.out.println("表演之前。。。。");
	}
	@After("execution(* *.*.perform(..))")
	public void after(){
		System.out.println("表演之后。。。。");
	}
	@AfterReturning("execution(* *.*.perform(..))")
	public void afterReturn(){
		System.out.println("表演完成。。。。");
	}
	@AfterReturning("execution(* *.*.perform(..))")
	public void afterThrow(){
		System.out.println("表演失败。。。。");
	}*/
	@Before("peformance(nums)")
	public void before(int nums){
		System.out.println("表演之前。。。。"+nums+"个人");
	}
	@After("peformance(nums)")
	public void after(int nums){
		System.out.println("表演之后。。。。");
	}
	@AfterReturning("peformance(nums)")
	public void afterReturn(int nums){
		System.out.println("表演完成。。。。");
	}
	@AfterThrowing("peformance(nums)")
	public void afterThrow(int nums){
		System.out.println("表演失败。。。。");
	}
	@Around("peformance(nums)")
	public Object around(ProceedingJoinPoint jp,int nums) throws Throwable{
		
		
			 System.out.println("@Around：执行目标方法之前...");
		        //访问目标方法的参数：
			 Object[] args = jp.getArgs();
		        //用改变后的参数执行目标方法
		        Object returnValue = jp.proceed(args);
		        System.out.println("@Around：执行目标方法之后...");
		        System.out.println("@Around：被织入的目标对象为：" + jp.getTarget());
		        return "原返回值：" + returnValue + "，这是返回结果的后缀";
	}
	
}
