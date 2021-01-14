package com.cristian.dependency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:area.properties")
public class FigurePropertyConfiguration {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertiesConfig() {
		
		return new PropertySourcesPlaceholderConfigurer();
	}

}