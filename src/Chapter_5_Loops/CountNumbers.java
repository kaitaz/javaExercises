package Chapter_5_Loops;

/*(Count positive and negative numbers and compute the average of numbers)
Write a program that reads an unspecified number of integers, determines how
many positive and negative values have been read, and computes the total and average
of the input values (not counting zeros). Your program ends with the input
0. Display the average as a floating-point number.*/

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// Get User Input and process
		Scanner input = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		double sum = 0;
		int counter = 0;
		int integer;
		
		System.out.print("Enter an integer, (0 ends): ");
		integer = input.nextInt();
		
		
		if (integer == 0) {
			System.out.println("No numbers are entered except 0");
		}
		else {
			if (integer > 0) {
				pos++;}
			else {
				neg++;}
			
			counter++;
			sum += integer;
			
			while (integer != 0) {
				
				System.out.print("Enter an integer, (0 ends): ");
				integer = input.nextInt();
				
				if (integer > 0) {
					pos++;
					counter++;}
				else if(integer < 0){
					neg++;
					counter++;}
				else {}
				sum += integer;
				
			} 
			
			double average = sum / counter;
			
			// Display the results
			System.out.println("The number of positives is " + pos + "\nThe number of negatives is " + neg +
					"\nThe total is " + sum + "\nThe average is " + average);
		}
		

	}

}
