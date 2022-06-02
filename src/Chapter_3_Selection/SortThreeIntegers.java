package Chapter_3_Selection;

/*(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.*/

import java.util.Scanner;

public class SortThreeIntegers {

	public static void main(String[] args) {
		// Get user Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();
		int integer3 = input.nextInt();
		
		//Sort and Display
		
		int temp = 0;
		if (integer3 < integer2) {
			temp = integer3;
			integer3 = integer2;
			integer2 = temp;}
		 
		if (integer2 < integer1) {
			temp = integer2;
			integer2 = integer1;
			integer1 = temp;}

		//Display the numbers
		System.out.println("Sorted Integers are: " + integer1 + ", " + integer2 + ", " + integer3);
	
	}
}
