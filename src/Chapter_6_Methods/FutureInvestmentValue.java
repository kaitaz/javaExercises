package Chapter_6_Methods;

/*(Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number
of years. 
Write a test program that prompts the user to enter the investment amount (e.g.,
1,000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30*/

import java.util.Scanner;

public class FutureInvestmentValue {

	public static void main(String[] args) {
	//Test the method
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the amount invested: ");
	double amount = input.nextDouble();
	System.out.print("Enter the interest rate: ");
	double monthlyInterestRate = (input.nextDouble() / 100) / 12;
	System.out.print("Enter the number of  years: ");
	int numberOfYears =input.nextInt();
	double investReturn;
	int i;
	
	System.out.println("\nYear\t  Value");
	for( i = 1; i <= numberOfYears; i ++) {
		investReturn = futureInvestmentValue(amount, monthlyInterestRate, i);
		System.out.printf("%2d\t%8.2f\n", i, investReturn);
		}
	
	}
	//Compute the investment
	private static double futureInvestmentValue(double amount, double monthlyInterestRate, int numberOfYears) {
		
		double futureInvestmentValue = amount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
		return futureInvestmentValue;
	}
}

	
