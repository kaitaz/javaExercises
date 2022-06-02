package Chapter_3_Selection;

/*Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots.”*/

import java.util.Scanner;

public class SolveQuadraticEquation {

	public static void main(String[] args) {
		// Get user Input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a, b, c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		//Compute the root and display
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		double root1, root2;
		if(discriminant > 0) {
			root1 = (-b + Math.pow(discriminant, 0.5))/ 2 * a;
			root2 = (-b - Math.pow(discriminant, 0.5))/ 2 * a;
			System.out.printf("The equation has two roots: %4f and %4f ",root1, root2);}
		else if(discriminant == 0) {
			root1 = -b / 2 * a;
			System.out.printf("The equation has one roots: %4f", root1);}
		else 
			System.out.println("The equation has no real roots");
		
	}

}
