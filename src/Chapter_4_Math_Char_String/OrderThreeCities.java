package Chapter_4_Math_Char_String;

/*(Order three cities) Write a program that prompts the user to enter three cities
and displays them in ascending order*/

import java.util.Scanner;

public class OrderThreeCities {

	public static void main(String[] args) {
		// Get user Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first city : ");
		String city1 = input.nextLine();
		System.out.print("Enter second city : ");
		String city2 = input.nextLine();
		System.out.print("Enter third city : ");
		String city3 = input.nextLine();
		
		
		
		//Sort and Display
		
		String temp = null;
		if (city3.compareTo(city2) < 0) {
			temp = city3;
			city3 = city2;
			city2 = temp;}
		 
		if (city2.compareTo(city1) < 0) {
			temp = city2;
			city2 = city1;
			city1 = temp;}

		//Display the numbers
		System.out.println("The three cities in alphabetical order is: " + city1 + ", " + city2 + ", " + city3);
	
	}
}
