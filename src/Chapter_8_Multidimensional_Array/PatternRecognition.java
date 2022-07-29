package Chapter_8_Multidimensional_Array;

import java.util.Scanner;

/*(Pattern recognition: four consecutive equal numbers) Write the following
method that tests whether a two-dimensional array has four consecutive numbers
of the same value, either horizontally, vertically, or diagonally:
public static boolean isConsecutiveFour(int[][] values)

Write a test program that prompts the user to enter the number of rows and
columns
of a two-dimensional array then the values in the array, and displays true
if the array contains four consecutive numbers with the same value. Otherwise,
the program displays false.*/

public class PatternRecognition {

	public static void main(String[] args) {
		// Ask user for rows and column number 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num of rows and coulumn separated by space: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		// Create an two dimensional array with random values
		int[][] numbers = new int[row][column];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = (int) (Math.random() * 10);
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
			

	}

	public static boolean isConsecutiveFour(int[][] numbers) {
		
		for (int row = 0; row < numbers.length; row++) {
			for (int column = 0; column < numbers[row].length; column++) {
				numbers[row][column] = (int) (Math.random() * 10);
				System.out.print(numbers[row][column]);
			}
			
			System.out.println();
		}
		
		
		return false;
		
	}
}
