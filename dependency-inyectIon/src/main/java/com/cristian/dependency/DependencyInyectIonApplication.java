package com.cristian.dependency;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.cristian.dependency.aop.TargetObject;
import com.cristian.dependency.autorired.AreaCalculatedService;
import com.cristian.dependency.lifecycle.ExplicitBean;
import com.cristian.dependency.lifecycle.LifeCycleBean;
import com.cristian.dependency.profile.EnviromentService;
import com.cristian.dependency.qualifiers.Animal;
import com.cristian.dependency.scopes.EjemploScope;

@SpringBootApplication
public class DependencyInyectIonApplication {
	

	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectIonApplication.class);

		
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectIonApplication.class, args);
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hello World", "From AOP");
	}

}
