package Chapter_13_AbstractClasses_and_Interfaces;

/*(The Colorable interface) Design an interface named Colorable with a void
method named howToColor(). Every class of a colorable object must implement
the Colorable interface. Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides. The Square class contains a
data field side with getter and setter methods, and a constructor for constructing
a Square with a specified side. The Square class has a private double data field
named side with its getter and setter methods. It has a no-arg constructor to
create a Square with side 0, and another constructor that creates a Square with
the specified side.
Draw a UML diagram that involves Colorable, Square, and GeometricObject.
Write a test program that creates an array of five GeometricObjects. For each object
in the array, display its area and invoke its howToColor method if it is colorable*/

public interface Colorable {

	public default void howToColor() {
		System.out.println("Color not defined");
	}
}

class Square extends GeometricObject implements Colorable{
	
	private double side = 0;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side =  side;
	}
	@Override
	public  void howToColor() {
		System.out.println("Color all four sides");
	}
	
	@Override
	public double getArea() {
		
		return side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side * 4;
	}
	
	public String toString() {
		return "Square: side = " + side;
	}
	
}