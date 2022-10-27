package com.lawencon.twodimensionalfigure;

public class Circle extends TwoDimensionalFigure {
	float radius;
	
		
		public Circle(float radius) {
			this.radius= radius;
			
		}
		
		@Override
		public float calculatePerimeter() { 
			
			
			float perimeter = radius*2*22/7;
			
			return perimeter;
			
		}
		
		@Override
		public float calculateArea() {

			float area = radius*22/7*radius;
			
			return area;
		}
}
