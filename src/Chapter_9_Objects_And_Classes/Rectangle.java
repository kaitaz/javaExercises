package Chapter_9_Objects_And_Classes;

/*(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
	Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
	A no-arg constructor that creates a default rectangle.
	A constructor that creates a rectangle with the specified width and height.
	A method named getArea() that returns the area of this rectangle.
	A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test program
that creates two Rectangle objects—one with width 4 and height 40, and
three objectives
Programming Exercises 363
the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.*/

/* UML
 	Rectangle
 width: double
 height: double
 Rectangle()
 Rectangle(width: double, height: double)
 getArea(): double
 getPerimeter(): double
 
 rectangle1: Rectangle
 ---------------------
 width = 4
 height = 40
 
 rectangle2: Rectangle
 ---------------------
 width = 3.5
 height = 35.9
 
 */
public class Rectangle {
	
	double width;
	double height;
	
	//Construct a rectangle with width and height equal 1
	Rectangle(){
		width = 1;
		height = 1;
	}
	
	//Construct a rectangle with custom width and height 
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	//Get rectangle area
	double getArea() {
		return width * height;
	}
	
	//Get rectangle perimeter
	double getPerimeter() {
		return 2 * width + 2 * height;
	}

}
