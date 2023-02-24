package com.fwatanabe.patterns.flyweight.paintapp;

public class Rectangle extends Shape {

	private String label;
	
	public Rectangle(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public void draw(int length, int breadth, String fillStyle) {
		System.out.println(
				String.format(
						"Drawing a %s with length %d, bredth %d and "
						+ "fill style %s", label, length, breadth, fillStyle));
	}
}
