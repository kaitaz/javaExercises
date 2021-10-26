package ch_9_Object_and_Classes;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] numbers = new double[row][column];
		System.out.println("Enter the array: ");
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers [i].length; j++) {
			numbers [i][j] = input.nextDouble();
			}
		}

		Location location =  locateLargest(numbers);
		System.out.println("The largest element is " + location.getMaxValue() + " and its location is at row " + location.getRow() 
				+ " and column " + location.getColumn()); 
	}
		
		
	
	
	public static Location locateLargest(double[][] numbers) {
		Location location = new Location();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers [i].length; j++) {
				if (numbers[i][j] > location.maxValue) location.maxValue = numbers[i][j];
				location.row = i - 1;
				location.column = j - 1;
			}
		}
		
		return location;
		

	}

}

