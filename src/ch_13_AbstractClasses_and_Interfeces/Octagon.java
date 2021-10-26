package ch_13_AbstractClasses_and_Interfeces;

import Imported_Class.GeometricObjectAbstract;

/*13.11 (The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaces.
Assume all eight sides of the octagon are of equal length. The area can be computed using the following formula:
area = 12 + 4/222 * side * side

The Octagon class has a private double data field named side with its getter and
setter methods. The class has a no-arg constructor that creates an Octagon with
side 0, and a constructor to create an Octagon with a specified side.

*/

public class Octagon extends GeometricObjectAbstract implements Comparable <Octagon>, Cloneable{
	
	private double side;
	
	public Octagon() {
		
	}
	
	public Octagon(double side, String color, boolean filled) {
		super(color,filled);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		double area;
		
		area = 12 + (4/222) * side * side;
		
		return area;
	}
	
	public double getPerimeter() {
		return side * 8;
	}
	
	public String toString() {
		return "\nOctagon: side : " + side  + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

	@Override
	public int compareTo(Octagon o) {
		if (side > o.side)  
			return 2;
		else if (side < o.side)
			return 1;
		else 
			return 0;
	}
	
	@Override 
	public Object clone() {
	try {
		return super.clone();
	}
	catch (CloneNotSupportedException ex) {
		return null;
	}
	}
}
