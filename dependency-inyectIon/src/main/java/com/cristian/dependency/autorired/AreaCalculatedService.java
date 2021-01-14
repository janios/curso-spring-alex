package com.cristian.dependency.autorired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaCalculatedService {
	
	@Autowired
	private List<Figure> figures;
	
	public double calcAreas() {
		double area =0.0;
		
		for(Figure figure : figures) {
			area += figure.calculateArea();
		}
		
		return area;

	}

	public int size() {
		return figures.size();
	}
	
	
}
