package Chapter_12_ExceptionHandling_and_TextIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.*/

public class RemoveText {
	public static void main(String[] args) throws Exception{
		
		// Check command line parameter usage
		if(args.length != 2) {
			System.out.println("Usage: java RemoveText filename");
			System.exit(1);
		}
		
		// Check if  file exists
		File file = new File(args[1]);
		if(!file.exists()) {
			System.out.println("The file is missing");
			System.exit(2);
			
		}
		
		//Check if file already exist
		File tempFile = new File("F:\\\\TEST\\\\test1.txt");
		if(tempFile.exists()) {
			System.out.println("The file already created");
			System.exit(3);
			
		}
		
		try(
			Scanner input = new Scanner(file);
			PrintWriter output = new PrintWriter(tempFile);
				
				){
			while(input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(("(?i)" + args[0]), "");
				output.println(s2);
				
			}
			
		}
		
		file.delete();
		tempFile.renameTo(file);
		
		
	}

}
