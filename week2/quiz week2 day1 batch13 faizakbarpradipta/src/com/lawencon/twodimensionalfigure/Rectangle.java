package com.lawencon.twodimensionalfigure;

public class Rectangle extends TwoDimensionalFigure {
	float side;
	
	public Rectangle(float side) {
		this.side = side;
		
	}
	
	@Override
	public float calculatePerimeter() { 
		
		
		float perimeter = side*4;
		
		return perimeter;
		
	}
	
	@Override
	public float calculateArea() {

		float area = side *side;
		
		return area;
	}
}
