package Chapter_5_Loops;

import java.util.Scanner;

/*(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as presented in the following sample run:*/

public class DisplayPiramid {
	

	public static void main(String[] args) {
		
		
		int i, j, k, l, numberOfRows;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Number of rows from 1 to 15: ");
		numberOfRows = input.nextInt();
		if (numberOfRows > 15 || numberOfRows < 0) {
			System.out.println("Not in range");
		}
		else {
			for ( i = 1; i <= numberOfRows; i++)   {  
				
		        for (j = 1; j <= numberOfRows - i; ++j)  {  
		        	System.out.print("   "); }  
		        
		        
		        for ( k = i; k >= 1 ; k--) {  
		        	System.out.printf ("%3d", k); }  
		        
		        for ( l = 2; l <= i ; l++) {  
		        	System.out.printf ("%3d", l); }
		    System.out.print ("\n"); 
		    }  
		}
		

	}
		
		
}


