package ch_9_Object_and_Classes;

/*Write a test program
that creates two Rectangle objects—one with width 4 and height 40, and the other 
with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.*/

public class RectangleTest {

	public static void main(String[] args) {
		// Create a Rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The rectangle with width " + rectangle1.getWidth() + 
				" and height " + rectangle1.getHeight() + " has area: "  + rectangle1.getArea() +
				" and perimeter :"  + rectangle1.getPerimeter());

		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The rectangle with width " + rectangle2.getWidth() + 
				" and height " + rectangle2.getHeight() + " has area: "  + rectangle2.getArea() +
				" and perimeter :"  + rectangle2.getPerimeter());
	}

}
