package ch_9_Object_and_Classes;

/*9.1 (The Rectangle class) Design a class named Rectangle to represent a rectangle. The class contains:
-Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
-A no-arg constructor that creates a default rectangle.
-A constructor that creates a rectangle with the specified width and height.
-A method named getArea() that returns the area of this rectangle.
-A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. */

	/*UML
	Rectangle
	+ width: double
	+ height: double
	----------------------------------------------
	Rectangle()
	Rectangle(newWidth: double, newHeihgt: double)
	getArea() double
	getPerimeter
	*/

public class Rectangle{
	double width;
	double height;
	
	Rectangle(){
		width = 1;
		height = 1;
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height =  height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
		
		
	}
	
	public  double getPerimeter() {
		return  2 * width + 2 * height;
		
	}
	
	
}
