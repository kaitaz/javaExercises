package Chapter_6_Methods;

/*(Check password) Some Websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
	A password must have at least eight characters.
	A password must contain only letters and digits.
	A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed, or Invalid Password otherwise.*/

import java.util.Scanner;
public class CheckPassword {
	
	public static void main(String[] args) {
		// Get user input and Check
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an password for check: ");
		String password = input.next();
		
		if(checkPassword(password)) 
			System.out.print("Valid Password ");
		else
			System.out.print("Invalid Password ");
		
	}
	//Check the password
	public static boolean checkPassword(String pass) {
		boolean digitsAndLetters = contain(pass);
		int numberOfDigits = countDigits(pass);
		if (pass.length() >= 8 && digitsAndLetters == true && numberOfDigits >= 2 )
			return true;
		else
			return false;
	}
	//Count Digits
	private static int countDigits(String password) {
		int countDigit = 0;
	
	
		for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i)) == true )
				countDigit++;}
		
		return countDigit;
	}
	//Check Letters and Digits
	private static boolean contain(String password) {
		int counter =0;
		boolean containDigitAndLetter;
		for(int i = 0; i < password.length(); i ++) {
			if(Character.isDigit(password.charAt(i)) == true || Character.isLetter(password.charAt(i)) == true)
				counter++;
		}
		
		if (counter == password.length())
			containDigitAndLetter = true;
		else
			containDigitAndLetter = false;
		return containDigitAndLetter;
	}

}
