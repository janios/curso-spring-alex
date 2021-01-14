package com.cristian.dependency.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TargetObject {

	
	private static final Logger log = LoggerFactory.getLogger(TargetObject.class);

	@Devs4JAnnotation
	public void hello(String message, String data){
		log.info("message {} data {}", message, data);
	}
}
