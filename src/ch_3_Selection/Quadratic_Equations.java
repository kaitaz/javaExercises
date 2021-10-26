package ch_3_Selection;

import java.util.Scanner;

public class Quadratic_Equations {

	/*3.1 (Algebra: solve quadratic equations)* Nested if*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a, b, c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// Calculate discrimminant and roots.
		double d, r1, r2;
		
		d = Math.pow(b, 2) - 4*a * c;
		
		r1= (-b + Math.pow(d, 0.5))/2 * a;
		r2= (-b - Math.pow(d, 0.5))/2 * a;
		
		//Check the roots
		
		if (d > 0)
		System.out.printf("The equation has two roots: %.2f and %.2f", r1, r2);
		
		else if (d == 0)
			System.out.printf("The equation has one root: %.2f ", r1);
		
		else
			System.out.println("The equation has no real roots");
		
	}

}