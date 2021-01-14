package com.cristian.dependency.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutExample {

	//@Pointcut("execution(* com.cristian.dependency.aop.TargetObject.*(..))")
	//@Pointcut("within(com.cristian.dependency.aop.*)")
	@Pointcut("@annotation(Devs4JAnnotation)")
	public void targetObjectMethods() {
		
	}
	
}
