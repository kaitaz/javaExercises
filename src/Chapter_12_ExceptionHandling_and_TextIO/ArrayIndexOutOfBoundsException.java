package Chapter_12_ExceptionHandling_and_TextIO;

/*(ArrayIndexOutOfBoundsException) Write a program that meets the
following
requirements:
	Creates an array with 100 randomly chosen integers.
	Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message "Out of Bounds".*/

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		// Create an array
		int[] numberArray = createArray();
		
		try {
			displayNumber(numberArray);
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}

	}

	private static void displayNumber(int[] numberArray) throws IndexOutOfBoundsException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index from 1 to 100: ");
		int number = input.nextInt() - 1;
		if (number > numberArray.length)
			throw new IndexOutOfBoundsException("Out of Bounds");
		else
			System.out.println(numberArray[number]);
		
		
	}

	private static int[] createArray() {
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
			//System.out.print(numbers[i] + "  ");
			
		}
		return numbers;
	}

}
