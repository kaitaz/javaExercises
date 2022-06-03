package Chapter_4_Math_Char_String;

import java.util.Scanner;

public class VowelOrConsoant {

	public static void main(String[] args) {
		// Get User Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String str = input.next();
		char ch = str.charAt(0);
		
		// Check if is a letter
		if (Character.isLetter(ch)) {
			if (Character.toLowerCase(ch) == 'a' || ch == 'e' 
					|| ch == 'i' ||ch == 'o' || ch == 'u') 
				System.out.println("The character " + ch + " is vowel");
			
			else
				System.out.println("The character " + ch + " is consonant");
			
		}
		else 
			System.out.println("The character " + ch + " is invalid input");
			
	}

}
