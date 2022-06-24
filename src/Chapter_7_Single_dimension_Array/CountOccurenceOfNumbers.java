package Chapter_7_Single_dimension_Array;
import java.util.Scanner;


/*(Count occurrence of numbers) Write a program that reads the integers between
1 and 100 and counts the occurrences of each. Assume the input ends with 0.  Note that if a number 
occurs more than one time, the plural word “times” is used in the output. 
Numbers are displayed in increasing order*/

public class CountOccurenceOfNumbers {

	public static void main(String[] args) {
		
		//Initialize the Array
		int[] numbers = initializeArray();
		
		
		
		//Count the occurrence
		int[] counter = countNumbers(numbers);
		System.out.println();
		//Display the numbers
		System.out.println();
		System.out.println("The occurrences of each number are:");
		displayCounts(counter);
	}

	private static void displayCounts(int[] counter ) {
		
		for (int i = 1; i < counter.length; i++) {
			if(counter[i] != 0) {
				if (counter[i] >= 2)
				System.out.println(i + " times " + counter[i]);
				else
				System.out.println(i + " time " + counter[i]);
			}
		}
		
	}

	private static int[] countNumbers(int[] numbers) {
			
		//Arrays.sort(numbers);
		int[] counter = new int[numbers.length ];
		for (int i = 0; i < numbers.length - 1; i++){
			counter[numbers[i]]++;
		}
		return counter;
	}

	private static int[] initializeArray() {
		int[] numbers = new int[100];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
			if (numbers[i] == 0)
				break;
		}
		
		
		return numbers;
	}

}

