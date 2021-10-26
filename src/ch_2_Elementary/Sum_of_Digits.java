package ch_2_Elementary;

import java.util.Scanner;

/*2.6 (Sum the digits in an integer) Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer.*/

public class Sum_of_Digits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int fst, sec, thrd, sum;
		
		fst = number % 10;
		sec = (number / 10) % 10;
		thrd = (number /100) % 10;
		sum = fst + sec + thrd;
		
		System.out.println("The sum of digitd in number "+ number + " is: " + sum);

	}

}
