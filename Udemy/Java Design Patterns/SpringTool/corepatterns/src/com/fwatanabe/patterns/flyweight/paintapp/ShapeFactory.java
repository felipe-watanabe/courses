package com.fwatanabe.patterns.flyweight.paintapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeFactory {

	private static Map<String, Shape> shapes = new HashMap<>();
	
	public static Shape getShape(String type) {
		Shape shape = null;
		
		if (Objects.nonNull(shape))
			shape = shapes.get(type);
		else if (type.equals("circle"))
			shape = new Circle(type);
		else if (type.equals("rectangle"))
			shape = new Rectangle(type);
		
		shapes.put(type, shape);
		
		return shape;
	}
}
