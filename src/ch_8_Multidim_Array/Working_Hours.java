package ch_8_Multidim_Array;

import java.util.Scanner;

/*8.4 (Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. Write a program that displays employees
and their total hours in decreasing order of the total hours.*/

public class Working_Hours {

	public static void main(String[] args) {
		
		// Create the table
		String [] days = {"Su", "M", "T", "W", "Th", "F", "Sa"};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int employees = input.nextInt();
		
		for (int j = 0; j < days.length; j++) {
			System.out.print(days [j] + "\t");
		}
		System.out.println();
		System.out.println();
		int [][] workingHours = createTable(days.length, employees);
		
		// Sum and sort
		int [] sumValues = sum(workingHours,employees);
		int [] index = new int [sumValues.length];
		for (int i = 0; i < sumValues.length; i++) {
	  		index[i] = i;
		}
		selectionSort(sumValues, index);
		
		//Display the employees and total hours in decreasing order
		display(sumValues, index);
		
		
	}
	

	public static void display(int[] sumValues, int[] index) {
		for (int i = sumValues.length-1; i >= 0; i--) {
			System.out.println("Employee " + index[i] + " worked " + sumValues[i] + " hours");
		}
	}

	public static int[] sum(int [][] workingHours, int employees) {
		int [] sum = new int [employees];
		
			for (int i = 0; i < workingHours.length; i++) {
				for (int j = 0; j < workingHours[i].length; j++) {
					sum [i] += workingHours[i][j];
				}
			}
		return sum;
	}

	public static int[][] createTable(int daysLength, int employees) {
		
		// Generate working hours array
		int hours [][] = new int [employees][daysLength];
		
		for (int i = 0; i < employees; i++) {
			for (int j = 0; j < daysLength; j++) {
				hours [i][j] = (int) (Math.random() * 8);
				System.out.print(hours [i][j] + "\t");
			}
			System.out.println();
		}
		
		return hours;
	}
	
	  public static void selectionSort(int[] sum, int[] index) {
		  
		  for (int i = 0; i < sum.length - 1; i++) {
			// Find the minimum in the sum[i..sum.length-1]
			 double currentMin = sum[i];
			 int currentMinIndex = i;
			 int currentVal = index[i];
			 int currentIndex = i;

		     for (int j = i + 1; j < sum.length; j++) {
			      if (currentMin > sum[j]) {
			          currentMin = sum[j];
			          currentMinIndex = j;
			          currentVal = index[j];
			          currentIndex = j;
			          
			        }
			  
			      
			      }
	
			      // Swap sum[i] with sum[currentMinIndex] if necessary;
			      if (currentMinIndex != i) {
			        sum [currentMinIndex] = sum[i];
			        index [currentIndex] = index[i];
			        sum [i] = (int) currentMin;
			        index [i] = currentVal;
			       
			      }   
	 
		  	}
		  }

}
