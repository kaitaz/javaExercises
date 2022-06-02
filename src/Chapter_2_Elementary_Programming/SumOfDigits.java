package Chapter_2_Elementary_Programming;

/*Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer*/

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter subtotal and gratuity rate
		System.out.println("Enter a number between 0 an 1000: ");
		int number1 = input.nextInt();
		
		
		//Compute the sum of digit
		
		int digit1 = number1 % 10;
		int number2 = number1 / 10;
		int digit2 = number2 % 10;
		int number3 = number2 / 10;
		int digit3 = number3 % 10;
		int sum = digit1 + digit2 + digit3;
		
		//Display the results
		System.out.println("The sum of digits is " + sum);

	}

}
