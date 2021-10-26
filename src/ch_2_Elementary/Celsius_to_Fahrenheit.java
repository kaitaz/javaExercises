package ch_2_Elementary;

import java.util.Scanner;

/*2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
double value from the console, then converts it to Fahrenheit, and displays the
result.*/

public class Celsius_to_Fahrenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Celsius value: ");
		double cVal = input.nextDouble();
		
		double fVal = (9.0/5) * cVal +32;
		
		System.out.println(cVal + " Celsius is " + fVal + " Fahrenheit ");

	}

}
