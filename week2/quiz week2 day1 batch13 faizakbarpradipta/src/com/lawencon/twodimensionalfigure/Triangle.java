package com.lawencon.twodimensionalfigure;

public class Triangle extends TwoDimensionalFigure{
	float pedestal;
	float tall;
	
	public Triangle(float pedestal ,float tall) {
		this.pedestal = pedestal;
		this.tall = tall;
	}
	
	@Override
	public float calculatePerimeter() { 
		
		
		float perimeter = pedestal*3;
		
		return perimeter;
		
	}
	
	@Override
	public float calculateArea() {

		float area = pedestal*tall/2;
		
		return area;
	}

}
