package ch_13_AbstractClasses_and_Interfeces;

import Imported_Class.GeometricObjectAbstract;

/*13.1 (Triangle class) Design a new Triangle class that extends the abstract
GeometricObject class. Draw the UML diagram for the classes Triangle and
GeometricObject then implement the Triangle class. .

	UML
		TriangleClass_Abstract
	 + side1: double
	 + side2: double
	 + side3: double
	 -----------------
	 + Triangle()
	 + Triangle(side1: double, side2: double, side3: double)
	 + getSide1(): double;
	 + getSide2(): double;
	 + getSide3(): double;
	 + gerArea(side1: double, side2: double, side3: double): double
	 + gerPerimeter(side1: double, side2: double, side3: double): double
	 + toString(): String

*/

public class Triangle_Abstract extends GeometricObjectAbstract{
		
	public double side1;
	public double side2;
	public double side3;
	
	public Triangle_Abstract() {
		
	}
	
	public Triangle_Abstract(double side1, double side2, double side3, String color, boolean filled) {
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
