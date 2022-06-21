package Chapter_7_Single_dimension_Array;

/*(Statistics: compute deviation) 
Your program should contain the following methods:
/** Compute the deviation of double values */
//public static double deviation(double[] x)
/** Compute the mean of an array of double values */
//public static double mean(double[] x)
//Write a test program that prompts the user to enter 10 numbers and displays the
//mean and standard deviation, as presented in the following sample run:*/

import java.util.Scanner;

public class StatisticsComputeDeviation {

	public static void main(String[] args) {
		//Get the numbers
		double[] numbers = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  10 numbers : ");
		
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		
		
		//Compute the mean
		double mean = computeMean(numbers);
		
		//Compute the deviation
		double deviation = computeDeviation(numbers, mean);
		
		//Display
		System.out.printf("The mean is %5.3f:\n", mean);
		System.out.printf("The standard deviation is %5.3f: ", deviation);
	}
	
	
	
	private static double computeDeviation(double[] numbers, double mean) {
		double total = 0;
		int numberCounts = 0;
		
		for (int i = 0; i < numbers.length; i++) {
		total += Math.pow((numbers[i] - mean), 2);
		numberCounts++;}
		
		double deviation = Math.sqrt(total / (numberCounts - 1));
		
		return deviation;
	}



	private static double computeMean(double[] numbers) {
		double total = 0;
		int numberCounts = 0;
		
		for (int i = 0; i < numbers.length; i++) {
		total += numbers[i];
		numberCounts++;}
		
		double mean = total / numberCounts;
		return mean;
	}

}
