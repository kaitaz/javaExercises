package ch_17_Binary_IO;

/*17.5 (Store objects and arrays in a file) Write a program that stores an array of the five
int values 1, 2, 3, 4, and 5, a Date object for the current time, and the double
value 5.5 into the file named Exercise17_05.dat. In the same program, write the
code to read and display the data.*/

import java.io.*;
import java.util.Date;

public class StoreObjects_and_Arrays {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		int[] numbers = {1, 2, 3, 4, 5};
		Date date = new Date();
		double doubleNum = 5.5;
		
	// Create an ObjectOutputSream
	try(
		ObjectOutputStream output = 
		new ObjectOutputStream(new FileOutputStream ("C:/book/Exercise17_05.dat", true));
			){
		output.writeObject(numbers);
		output.writeObject(date);
		output.writeObject(doubleNum);
		
	}
	
	// Create an ObjectInputSream
		try(
			ObjectInputStream input = 
			new ObjectInputStream(new FileInputStream ("C:/book/Exercise17_05.dat"));
				){
			int[] newNumbers = (int[])(input.readObject());
			Date newDate = (Date)(input.readObject());
			double newDoubleNum = (double)(input.readObject());
			
			for (int i = 0; i < newNumbers.length; i++) {
				System.out.print(newNumbers[i] + " ");
				
			}
			System.out.println();
			System.out.println(newDate);
			System.out.println(newDoubleNum);
		}
		
	}

}
