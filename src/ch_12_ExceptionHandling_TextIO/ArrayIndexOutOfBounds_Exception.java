package ch_12_ExceptionHandling_TextIO;

import java.util.Scanner;

/*
 *12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the
following
requirements:
	Creates an array with 100 randomly chosen integers.
 	Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message "Out of Bounds".*/

public class ArrayIndexOutOfBounds_Exception {

	public static void main(String[] args) {
		int[] numbers = createArray();
		boolean inputStill = false;
		
		
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.print("\nEnter an index: ");
				int index = input.nextInt();
				System.out.print("\nValue at index: " + numbers[index]);
				
				inputStill = true;
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.print("\nOut of bounds");
				inputStill = false;
			}
		} while (inputStill);
		

	}
	
	public static int[] createArray() {
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
			}
		return numbers;
	}

}
