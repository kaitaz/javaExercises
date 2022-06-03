package Chapter_4_Math_Char_String;

/*(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character. Here is a sample run:*/

import java.util.Scanner;

public class CharacterOfASCIICode {

	public static void main(String[] args) {
		// Get User Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII Code(from 0 to 127): ");
		int integer = input.nextInt();
		char ch = (char) integer;
		
		//Display
		System.out.println("The character for ASCII code: " + integer + " is: " + ch);

	}

}
