package Ch_11_Inheritance_and_Polimorphism;

import Imported_Class.GeometricObject;

/*11.1 Polimorphism implementation 
 (The Triangle class) Design a class named Triangle that extends
GeometricObject.
The class contains:
	 Three double data fields named side1, side2, and side3 with default values
1.0 to denote three sides of a triangle.
	 A no-arg constructor that creates a default triangle.
	 A constructor that creates a triangle with the specified side1, side2, and side3.
	 The accessor methods for all three data fields.
	 A method named getArea() that returns the area of this triangle.
	 A method named getPerimeter() that returns the perimeter of this triangle.
	 A method named toString() that returns a string description for the triangle.
	 
	 UML
	 	Triangle
	 + side1: double
	 + side2: double
	 + side3: double
	 -----------------
	 + Triangle()
	 + Triangle(side1: double, side2: double, side3: double)
	 + getSide1() double;
	 + getSide2() double;
	 + getSide3() double;
	 + gerArea(side1: double, side2: double, side3: double) double
	 + gerPerimeter(side1: double, side2: double, side3: double) double
	 + toString() String
	 
	 
	 */

public class Triangle extends GeometricObject {
	
	public double side1;
	public double side2;
	public double side3;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color,filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s;
		double area;
		
		s = side1 + side2 + side3;
		
		area = Math.pow((s*(s - side1) * (s - side2) * (s - side3)), 0.5);
		
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
}













