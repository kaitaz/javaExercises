package ch_12_ExceptionHandling_TextIO;

import java.io.*;
import java.util.Scanner;

/*12.11 (Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.*/

public class RemoveOcurenceString {

	public static void main(String[] args) throws Exception {
		//Check command-line usage
		if (args.length != 2) {
			System.out.println("Usage Exrcise12_11");
			System.exit(1);
			
		}
		
		//Check if file exist
		File file = new File("C:\\book", args[0]);
		File fileResult = new File ("C:\\book", args[1]);
		
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		
		if (!file.exists()) {
			System.out.println("File for the result " + args[1] + " does not exist");
			System.exit(3);
		}
		
		
		Scanner input = new Scanner(file);
		PrintWriter output = new PrintWriter(fileResult);
			
		
		while (input.hasNext()) {
			String strng1 = input.nextLine();
			System.out.println(strng1);
			String strng2 = strng1.replaceAll("(?i)john" , "");
			output.println(strng2);
			}
			
		input.close();
		output.close();
	}
	

}
