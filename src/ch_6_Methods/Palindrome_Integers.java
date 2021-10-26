package ch_6_Methods;

import java.util.Scanner;

public class Palindrome_Integers {

	public static void main(String[] args) {
		
		// Get the number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//Check if s Palindrome and display
		
		if (isPalindrome(number)) 
			
			System.out.println("Introduced number is a palindrome.");
		else
			System.out.println("Introduced number is not a palindrome.");
			
	}
	
	public static int reverse(int number) {
		int nRev = 0; 
		int lastDigit;
		
		while(number > 0) {
			lastDigit = number % 10;
			nRev = nRev * 10 + lastDigit;
			number /= 10;
		}
			
		return nRev;
		
	}

	
	public static boolean isPalindrome(int number) {
		boolean res;
		
		if (number == reverse(number)) 
			res = true;
		else 
			res = false;
		
		return res;
			
	}
}
