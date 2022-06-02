package Chapter_2_Elementary_Programming;

import java.util.Scanner;

/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total.*/

public class CalcutateTips {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter subtotal and gratuity rate
		System.out.println("Enter the subtotal an gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		//Compute the total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		//Display the results
		System.out.println("The gratuity is " + gratuity + " and the total is " + total);

	}

}
