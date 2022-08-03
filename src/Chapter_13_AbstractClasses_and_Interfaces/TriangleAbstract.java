package Chapter_13_AbstractClasses_and_Interfaces;

import java.util.Scanner;

/*(Triangle class) Design a new Triangle class that extends the abstract
GeometricObject
class. Draw the UML diagram for the classes Triangle and
GeometricObject then implement the Triangle class. Write a test program
that prompts the user to enter three sides of the triangle, a color, and a Boolean
value to indicate whether the triangle is filled. The program should create a Triangle
object with these sides, and set the color and filled properties using the
input. The program should display the area, perimeter, color, and true or false to
indicate whether it is filled or not.*/
/*
 UML
 
 GeometricObject
 ----------------
- color: String
- filled: boolean
–dateCreated: java.util.Date

+ GeometricObject()
+ GeometricObject(color: String, filled: boolean)
+ getColor(): String
+ setColor(color: String): void
+ isFilled(): boolean
+ setFilled(filled: boolean): void
+ getDateCreated(): java.util.Date
+ toString(): String
+ getArea(): double
+ getPerimeter(): double
 
Triangle extends GeometriObject 
-------------------------------
- side1: double 
- side2: double
- side3: double 
+ Triangle()
+ Triangle(side1: double, side2: double, side3: double, String color, boolean: filled )
+ setSide1(side1: double)
+ setSide2(side2: double)
+ setSide3(side3: double)

+ toString(): String
 
  
 * */
public class TriangleAbstract{
	public static void main(String[] args) {
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
		
		GeometricObject triangle = new TriangleClass(a, b, c, color, filled);
		
		System.out.println("\n" +triangle.toString() + " has are: " + triangle.getArea() + ", has perimeter: " + triangle.getPerimeter() 
		+ "\nIt has the color " + triangle.getColor() + " and is filled: "+ triangle.isFilled());
	}
}

class TriangleClass extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public TriangleClass() {
		
	}
	
	public TriangleClass(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	
}



