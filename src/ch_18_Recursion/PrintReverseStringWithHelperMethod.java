package ch_18_Recursion;

import java.util.Scanner;

/*18.12 (Print the characters in a string reversely) Rewrite Programming Exercise 18.9
using a helper method to pass the substring high index to the method. The
helper method header is
public static void reverseDisplay(String value, int high)*/

public class PrintReverseStringWithHelperMethod {
	//Recursion method for reverse String
	
	public static void reverseDisplay(String s) {
		reverseDisplay(s, s.length() - 1) ;
	}
	
	public static void reverseDisplay(String s, int high) {
		if (s.charAt(0) != s.charAt(high)) {
			System.out.print(s.charAt(high));
			reverseDisplay(s, high - 1);}
		else {
			System.out.print(s.charAt(0));		
		}
			
	}
	//Test the method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String strng = input.next();
	
		reverseDisplay(strng);
	}
	
}
