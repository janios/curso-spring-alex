package com.cristian.dependency.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "pajarin")
public class Pajaro extends Animal implements Volador{

	
	public Pajaro(@Value("2") Integer edad, @Value("Nene") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}


	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	
	@Override
	public void volar() {
		log.info("Soy un pajaro y Estoy volando" );
	}

	
	
}
