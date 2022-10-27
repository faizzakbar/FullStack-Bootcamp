package com.lawencon.twodimensionalfigure;

public class Rectangular extends TwoDimensionalFigure{
float length;
float width;
	
	public Rectangular(float length, float width) {
		this. length= length;
		this.width = width;
	}
	
	@Override
	public float calculatePerimeter() { 
		
		float perimeter = (length*2)+(width*2);
		
		return perimeter;
		
	}
	
	@Override
	public float calculateArea() {

		float area = length*width;
		
		return area;
	}
}
