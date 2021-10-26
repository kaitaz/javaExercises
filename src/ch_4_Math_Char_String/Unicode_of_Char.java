package ch_4_Math_Char_String;

import java.util.Scanner;

public class Unicode_of_Char {

	public static void main(String[] args) {
		// Get the Char
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		// Transform
		int elem = (int)ch;
		
		//Output
		System.out.println("The Unicode for the character " +ch +" is " +elem);
	}

}
