package Chapter_11_Inheritance_And_Polymorphism;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 3 sides of the triangle:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		System.out.print("\nEnter color of the triangle:");
		String color = input.next();
		System.out.print("\nEnter color of the triangle (introduce true or false): ");
		boolean filled = input.nextBoolean();
		
		TriangleSubclass triangle = new TriangleSubclass(a, b, c, color, filled);
		
		System.out.println("\n" +triangle.toString() + " has are: " + triangle.getArea() + ", has perimeter: " + triangle.getPerimeter() 
		+ "\nIt has the color " + triangle.getColor() + " and is filled: "+ triangle.isFilled());
		
		

	}

}
