package com.Spring.testAop.one;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncoIntro {
	@DeclareParents(value="com.Spring.testAop.one.Performance+",defaultImpl=EncoIntroImpl.class)
	public static Encoreable encoreable;
}
