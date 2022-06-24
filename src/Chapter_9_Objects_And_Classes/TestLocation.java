package Chapter_9_Objects_And_Classes;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		// Get the table from user
		double[][] table = createTable();
		
		//Get maximum value;
		Location arrayMaxValue = locateLargest(table);
		
		//Display the array, maximum value and its index 
		display(table, arrayMaxValue);

	}

	private static void display(double[][] table, Location arrayMaxValue) {
		
		System.out.println("The array is:");
		for (int row = 0; row < table.length; row++) {
			for (int column = 0; column < table[row].length; column++) {
				System.out.print(table[row][column] + "\t");
				}
			System.out.println();
		}
		
		System.out.println("The largest element is " + arrayMaxValue.maxValue + ", "
				+ "located at (" + arrayMaxValue.row + ", " + arrayMaxValue.column + ")");
		
	}

	private static Location locateLargest(double[][] table) {
		
		double max = table[0][0];
		int rowIndex = 0;
		int columnIndex = 0;
		
		for (int row = 0; row < table.length; row++) {
			for (int column = 0; column < table[row].length; column++) {
				if (table[row][column] > max)
					max = table[row][column];
					rowIndex = row - 1;
					columnIndex = column - 1;
			}
		}
		
		Location arrayMaxValue = new Location(rowIndex, columnIndex, max);
		return arrayMaxValue;
	}

	private static double[][] createTable() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int rowNumber = input.nextInt();
		int columnNumber = input.nextInt();
		double[][] table = new double[rowNumber][columnNumber];
		System.out.println("Enter the array: ");
		for (int row = 0; row < table.length; row++) {
			for (int column = 0; column < table[row].length; column++) {
				table[row][column] = input.nextDouble();
			}
		}
		
		return table;
	}

}
