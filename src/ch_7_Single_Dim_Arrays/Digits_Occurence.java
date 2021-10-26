package ch_7_Single_Dim_Arrays;

public class Digits_Occurence {
	
	/*7.7 (Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number.*/
	
	public static void main(String [] args) {
		
		// Read the digits
		int[] digits = createArray();
		
		// Display random digits
		displayDigits(digits);
		
		// Check the occurrence
		int[] counts = countdigits(digits);
		
		// Display the digits and counts
		displayCounts(counts);
			
	}

	public static int[] createArray() {
		int[] digits = new int[100];
		
		for (int i = 0; i < digits.length; i++) {
			digits[i] = (int) (Math.random() * 9);
			}
		return digits;
	}

	public static int[] countdigits(int[] digits) {
		
		int[] counts = new int[9];

		for (int i = 0; i < digits.length; i++) {
			counts[digits[i]]++;
			}
		return counts;
		
	}


	public static void displayDigits(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.println(digits[i]);
			else
				System.out.print(digits[i] + " ");
		}
		System.out.println();
		
	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.printf ("%-3d",i);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			System.out.printf ("%-3d",counts[i]);
		
	}
}
}

