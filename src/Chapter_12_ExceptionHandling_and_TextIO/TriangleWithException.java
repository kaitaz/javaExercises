
package Chapter_12_ExceptionHandling_and_TextIO;

import java.util.Scanner;

import Chapter_11_Inheritance_And_Polymorphism.GeometricObject;


/*(IllegalTriangleException) Programming Exercise 11.1 defined the
Triangle class with three sides. In a triangle, the sum of any two sides is
greater than the other side. The Triangle class must adhere to this rule.
Create the IllegalTriangleException class, and modify the constructor
of the Triangle class to throw an IllegalTriangleException object if a
triangle is created with sides that violate the rule,
*/

/*The Triangle class) Design a class named Triangle that extends
GeometricObject.
The class contains:
	Three double data fields named side1, side2, and side3 with default values
1.0 to denote three sides of a triangle.
	A no-arg constructor that creates a default triangle.
	A constructor that creates a triangle with the specified side1, side2, and side3.
	The accessor methods for all three data fields.
	A method named getArea() that returns the area of this triangle.
	A method named getPerimeter() that returns the perimeter of this triangle.
	A method named toString() that returns a string description for the triangle.

Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.*/

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
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
 
  
 * */
public class TriangleWithException{
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
		
		
		try {
			TriangleClass triangle = new TriangleClass (a, b, c, color, filled);
		
		System.out.println("\n" + triangle.toString() + " has are: " + triangle.getArea() + ", has perimeter: " + triangle.getPerimeter() 
		+ "\nIt has the color " + triangle.getColor() + " and is filled: "+ triangle.isFilled());
		}
		
		catch(IllegalTriangleException ex) {
			System.out.println(ex);}
		}
	
}

class TriangleClass extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public TriangleClass() {
		
	}
	
	public TriangleClass(double side1, double side2, double side3, String color, boolean filled) 
		throws IllegalTriangleException{
		super(color, filled);
		
		if ((side1 >= (side2 + side3)) || (side2 >= (side1 + side3)) || (side3 >= (side2 + side1))){
			throw new IllegalTriangleException(side1,  side2, side3);
		}
				
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


