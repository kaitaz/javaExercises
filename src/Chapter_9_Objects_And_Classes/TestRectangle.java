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

public class TestRectangle {

	public static void main(String[] args) {
		System.out.printf("            %-8s%-8s%-8s%-8s","Width", "Height", "Area", "Perimeter\n");
		
		// Create a default rectangle
		Rectangle rectangle = new Rectangle();
		System.out.printf("Rectangle0: %-8.2f%-8.2f%-8.2f%-8.2f\n", rectangle.width, 
				rectangle.height, rectangle.getArea(), rectangle.getPerimeter());
		
		// Create rectangle1
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.printf("Rectangle1: %-8.2f%-8.2f%-8.2f%-8.2f\n", rectangle1.width, 
				rectangle1.height, rectangle1.getArea(), rectangle1.getPerimeter());
		
		// Create rectangle2
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.printf("Rectangle2: %-8.2f%-8.2f%-8.2f%-8.2f\n", rectangle2.width, 
				rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());

	}

}
