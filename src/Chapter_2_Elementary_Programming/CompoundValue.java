package Chapter_2_Elementary_Programming;

/*Write a program that prompts the user to enter a monthly saving amount and displays
the account value after the sixth month. (In Programming Exercise 5.30, you
will use a loop to simplify the code and display the account value for any month.)*/

import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter amount
		System.out.println("Enter monthly saving amount: ");
		double amount = input.nextDouble();
		
		//Compute the account value
		double interestRateGrow = 1 + (double) 5 / 100 / 12 ;
		double amountMonth1, amountMonth2, amountMonth3, amountMonth4, amountMonth5, amountMonth6;
		amountMonth1 = amount * interestRateGrow;
		amountMonth2 = (amount + amountMonth1) * interestRateGrow;
		amountMonth3 = (amount + amountMonth2) * interestRateGrow;
		amountMonth4 = (amount + amountMonth3) * interestRateGrow;
		amountMonth5 = (amount + amountMonth4) * interestRateGrow;
		amountMonth6 = (amount + amountMonth5) * interestRateGrow;
		
		//Display the results
		System.out.printf("After six months, the acount value is %.2f", amountMonth6);

	}
}
