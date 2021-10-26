package Ch_11_Inheritance_and_Polimorphism;

import java.util.Scanner;
import Imported_Class.GeometricObject;

/*Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.*/

public class TestTrangle {

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
		
		GeometricObject triangle = new Triangle(side1, side2, side3, color, filled);
		
		display(triangle);
	}
	
	public static void display(GeometricObject geometricObj) {
		if (geometricObj instanceof GeometricObject) {
			System.out.println("Triangle area\t" + ((Triangle)geometricObj).getArea()
					+ "\nThe perimeter\t" + ((Triangle)geometricObj).getPerimeter() + 
					((Triangle)geometricObj).toString() );
			
		}
		else {
			System.out.println("Not an Triangle");
		}
		
	}

}
