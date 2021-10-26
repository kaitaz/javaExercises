package ch_12_ExceptionHandling_TextIO;

import Imported_Class.GeometricObject;

/*12.5 (IllegalTriangleException) Programming Exercise 11.1 defined the Triangle
class with three sides. In a triangle, the sum of any two sides is
greater than the other side. The Triangle class must adhere to this rule.
Create the IllegalTriangleException
class, and modify the constructor of the Triangle
class to throw an IllegalTriangleException object if a
triangle is created with sides that violate the rule
	 
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

public class TriangleWithException extends GeometricObject {
	
	public double side1;
	public double side2;
	public double side3;
	
	public TriangleWithException()  {
		
	}
	
	public TriangleWithException (double side1, double side2, double side3) {
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
	
	public void setSide1(double side1) throws IllegalTriangleException1{
		if(side1 > (side2 + side3)) {
			this.side1 = side1;
			}
		else {
			throw new IllegalTriangleException1(side1);
		}
	}
	
	public void setSide2(double side2) throws IllegalTriangleException2{
		if(side2 > (side1 + side3)) {
			this.side2 = side2;
			}
		else {
			throw new IllegalTriangleException2(side2);
		}
	}
	
	public void setSide3(double side3) throws IllegalTriangleException3{
		if(side3 > (side1 + side2)) {
			this.side3 = side3;
			}
		else {
			throw new IllegalTriangleException3(side3);
		}
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













