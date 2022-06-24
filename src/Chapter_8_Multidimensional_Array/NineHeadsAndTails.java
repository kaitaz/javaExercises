package Chapter_8_Multidimensional_Array;

import java.util.Scanner;

/*(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
face up and some face down. You can represent the state of the coins using a
3-by-3 matrix with values 0 (heads) and 1 (tails). 
Each state can also be represented using a binary number. For example, the preceding
matrices correspond to the numbers
000010000 101001100 110100001 101110100 100111110
There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . ,
and 511 to represent all states of the matrix. Write a program that prompts the
user to enter a number between 0 and 511 and displays the corresponding matrix
with the characters H and T.*/

public class NineHeadsAndTails {

	public static void main(String[] args) {
		// Get user input
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: " );
		int number = input.nextInt();
		
		//Concert number to binary
        int[] binary = new int[9];
        int id = 0;
        int count = 0;
        
        
        
        while (number > 0) {
            binary[id++] = number % 2;
            number = number / 2;
        }
        for (int i = binary.length - 1; i >= 0; i--) {
        	count = binary[i] + 1 ;
            
            
	        
	        
	        if((binary.length - 1 - i) % 3 == 0) 
	        	System.out.println();
	        if (binary[i] == 1) 
	        	System.out.print("T ");
	        else
	        	System.out.print("H ");
		        
        }
		

	}

}
