package ch_18_Recursion;

import java.util.Scanner;

/*18.9 (Print the characters in a string reversely) Write a recursive method that displays
a string reversely on the console using the following header:
public static void reverseDisplay(String value)*/
public class PrintReverseString {
	//Recursion method for reverse String
	public static void reverseDisplay(String s) {
		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			System.out.print(s.charAt(s.length() -1));
			reverseDisplay(s.substring(0, s.length() - 1));}
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
