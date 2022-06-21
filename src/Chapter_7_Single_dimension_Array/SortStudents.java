package Chapter_7_Single_dimension_Array;

import java.util.Scanner;

/*(Sort students) Write a program that prompts the user to enter the number of students,
the students’ names, and their scores and prints student names in decreasing
order of their scores. Assume the name is a string without spaces, use the Scanner’s
next() method to read a name*/


public class SortStudents {

	public static void main(String[] args) {
		
		//Take inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of student: ");
		int number = input.nextInt();
		String[] student = new String[number];
		double[] score = new double[number];
		
		for (int i = 0; i < student.length; i++){
			student[i] = input.next();
			score[i] = input.nextDouble();
		}
		//Sort and Display
		sortStudent(score, student);
		displayStudent(student, score);

	}

	private static void displayStudent(String[] student, double[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%2d.  %-10s %3.2f ", (i+1), student[i], score[i]);
			System.out.println();
		}
		
	}

	private static void sortStudent(double[] score, String[] student) {
		for (int i = 0; i < score.length - 1; i++) {
		
			double currentMax = score[i];
			String currentStrg = student[i];
			int currentMaxIndex = i;
			int currentStrgIndex = i;
			
			for (int j = i + 1; j < score.length; j++) {
				if (currentMax < score[j]) {
				currentMax = score[j];
				currentStrg = student[j];
				currentMaxIndex = j;
				currentStrgIndex= j;
				}
			}
			
			
			if (currentMaxIndex != i) {
			score[currentMaxIndex] = score[i];
			student[currentStrgIndex] = student[i];
			score[i] = currentMax;
			student[i] = currentStrg;
			}
			
		}
		
	}

}
