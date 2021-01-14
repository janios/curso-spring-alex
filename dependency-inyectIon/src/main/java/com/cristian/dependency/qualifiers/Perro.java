package com.cristian.dependency.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {

	public Perro(@Value("6") Integer edad, @Value("Percy") String nombre) {
		super(edad, nombre);
		
	}
 
	
	
}
