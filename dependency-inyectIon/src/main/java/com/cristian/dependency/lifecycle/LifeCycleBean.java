package com.cristian.dependency.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean{

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	
	@Override
	public void setBeanName(String name) {
		log.info("Bean Name Awere {}", name);
		
	}
	
	@PostConstruct
	public void init() {
		log.info("Post Construct");
	}
	
	@PreDestroy
	public void destroyBean() {
		log.info("Pre destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After Property set method");
		
	}

	@Override
	public void destroy() throws Exception {
		log.info("Distroy method");
		
	}

}
