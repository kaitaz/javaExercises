package ch_13_AbstractClasses_and_Interfeces;

import java.util.Scanner;
import Imported_Class.GeometricObject;
import Imported_Class.GeometricObjectAbstract;

/*Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean
value to indicate whether the triangle is filled. The program should create a Triangle
object with these sides, and set the color and filled properties using the
input. The program should display the area, perimeter, color, and true or false to
indicate whether it is filled or not*/

public class TestTriangle_Abstract {

	public static void main(String[] args) {
		
		double side1;
		double side2;
		double side3;
		String color;
		boolean filled;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter  the sides of the triangle : ");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		System.out.println("Enter  the color : ");
		color = input.next();
		System.out.println("Is it filled? : ");
		filled = input.nextBoolean();
		
		GeometricObjectAbstract triangle = new Triangle_Abstract(side1, side2, side3, color, filled);
		
		display(triangle);
	}
	
	public static void display(GeometricObjectAbstract geometricObj) {
		if (geometricObj instanceof GeometricObjectAbstract) {
			System.out.println("Triangle area\t" + ((Triangle_Abstract)geometricObj).getArea()
					+ "\nThe perimeter\t" + ((Triangle_Abstract)geometricObj).getPerimeter() + "\n" + 
					((Triangle_Abstract)geometricObj).toString() );
			
		}
		else {
			System.out.println("Not an Triangle");
		}
		
	}

}
