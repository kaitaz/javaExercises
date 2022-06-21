package Chapter_7_Single_dimension_Array;
/*Random number chooser) Write the following method that returns a random
number between start and end, excluding the numbers.
public static int getRandom(int start, int end, int... numbers)
For example, invoking getRandom(1,100,4,8,95,93) returns a random number
between 1 and 100 excluding 4,8,95,and 93. Write a test program that
invokes getRandom(1,100,4,8,95,93) 45 times and displays the resulting
numbers 15 per line using the format %4d.*/

public class RandomNumberChooser {

	public static void main(String[] args) {
		System.out.printf("The numbers are:\n");
		for(int i = 1; i <= 45; i++) {
			int number = getRangom(50, 100, 51, 52, 53, 54, 55);
			int count = i;
			if (number != 0) {
				if(count % 15 == 0)
					System.out.printf("%4d\n", number);
				else
					System.out.printf("%4d", number);}
		}

	}

	private static int getRangom(int start, int end, int... number) {
		int num = 0 ;
		boolean flag = false;
		int count = 0; 
		while (flag != true) {
			num = start + (int) (Math.random() * (end - start)) ;
			for (int i = 0; i < number.length; i++) {
				if (num != number[i]) 
					count++;
			}
			//System.out.println(count + "  " + number.length);
			if (count == number.length)
				flag = true;
			count = 0;
		}
		return num;
		
	}

}
