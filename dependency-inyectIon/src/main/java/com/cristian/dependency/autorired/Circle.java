package com.cristian.dependency.autorired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure {

	@Value("${circle.radius}")
	private double radius;
	
	@Override
	public double calculateArea() {
		
		return Math.PI * (radius * radius);
	}

}
