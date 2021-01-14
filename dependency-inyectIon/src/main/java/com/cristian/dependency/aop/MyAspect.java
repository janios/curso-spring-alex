package com.cristian.dependency.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyAspect {

	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before(value = "PointCutExample.targetObjectMethods()")
	public void before(JoinPoint joinPoint) {
		log.info("Method Name 1 {}", joinPoint.getSignature().getName());
		log.info("Object Type 1 {}", joinPoint.getSignature().getDeclaringTypeName());
		log.info("Modifiers 1 {}", joinPoint.getSignature().getModifiers());
		log.info("Is Public? 1 {}", Modifier.isPublic(joinPoint.getSignature().getModifiers()));
		log.info("Args 1 {}", joinPoint.getArgs());
		
		
	}
	
}
