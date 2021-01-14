package com.cristian.dependency.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

@Controller
@Aspect
@Order(0)
public class MyAspect2 {

	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before(value = "PointCutExample.targetObjectMethods()")
	public void before(JoinPoint joinPoint) {
		log.info("Method Name {}", joinPoint.getSignature().getName());
		log.info("Object Type {}", joinPoint.getSignature().getDeclaringTypeName());
		log.info("Modifiers {}", joinPoint.getSignature().getModifiers());
		log.info("Is Public? {}", Modifier.isPublic(joinPoint.getSignature().getModifiers()));
		log.info("Args {}", joinPoint.getArgs());
		
		
	}
	
	
}
