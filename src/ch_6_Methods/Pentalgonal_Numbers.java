package ch_6_Methods;

public class Pentalgonal_Numbers {
	
	/*6.1 (Math: pentagonal numbers)
	 * Write a method with the following header that returns a pentagonal number:
	 * Write a test program that uses this method to display the first
100 pentagonal numbers with 10 numbers on each line.
	 * */

	public static void main(String[] args) {
		// Input and outputs

		int number = 100;
		int i, pentagonal, counter = 0;
		
		// Process and display
		for (i = 1; i <= number; i++) {
			pentagonal = getPentagonalNumber(i);	//call the method
				
			if (counter % 10 == 0) {
				System.out.println("\n");		
			}
			
			System.out.printf("%7d",pentagonal);
			counter ++;
		}
		
	}
	//method
	public static int getPentagonalNumber(int n) {
		int nPent;
		
		nPent = n * (3 * n - 1) /2;
		
		return nPent;
	}

}
