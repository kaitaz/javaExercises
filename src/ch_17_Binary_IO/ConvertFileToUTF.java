package ch_17_Binary_IO;

import java.io.*;

import java.util.Scanner;

/*17.4 (Convert a text file into UTF) Write a program that reads lines of characters from
a text file and writes each line as a UTF string into a binary file. Display the
sizes of the text file and the binary file. Use the following command to run the
program:
java Exercise17_04 Welcome.java Welcome.utf*/

public class ConvertFileToUTF {

	public static void main(String[] args) throws Exception {
		//Check command-line usage
		if (args.length != 2) {
			System.out.println("Usage Exrcise17_4");
			System.exit(1);
			
		}
		
		//Check if file exist
		File file = new File("C:\\book", args[0]);
		
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		
		//Check if file exist
		File fileBin = new File("C:\\book", args[1]);
		
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		
		Scanner input = new Scanner(file);
		DataOutputStream outputFile = 
				new DataOutputStream(new FileOutputStream(fileBin));
	
		DataInputStream inputFile = 
				new DataInputStream(new FileInputStream(fileBin));
		
		while (input.hasNext()) {
			String strng1 = input.nextLine();
			outputFile.writeUTF(strng1);
			System.out.println(inputFile.readUTF() + " ");
			}
			
		input.close();
		outputFile.close();
		inputFile.close();
	}
	

}
