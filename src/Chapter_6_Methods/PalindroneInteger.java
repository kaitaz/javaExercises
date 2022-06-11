package Chapter_6_Methods;

import java.util.Scanner;

/*(Palindrome integer) Write the methods with the following headers:
// Return the reversal of an integer, e.g., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.*/

public class PalindroneInteger {

	public static void main(String[] args) {
		// Get user input to test the methods
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("The number " + number + " is palindrome?\n" + isPalindrome(number));
		reverse(number);
	}
	// Check if is palindrome
	private static boolean isPalindrome(int num) {
		
		if (num == reverse(num) ) 
			return true;
		else
			return false;
		
	}
	// Get the reverse of number
	private static int reverse(int num) {
		
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
			}
		return reverse;
		}
		
	

}
