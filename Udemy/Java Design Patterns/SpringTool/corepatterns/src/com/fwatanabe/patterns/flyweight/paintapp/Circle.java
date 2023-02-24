package com.fwatanabe.patterns.flyweight.paintapp;

public class Circle extends Shape {

	private String label;
	
	public Circle(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println(
				String.format(
						"Drawing a %s with radius %s. Fill color %s. "
						+ "Line color %s", label, radius, fillColor, lineColor));
	}
}
