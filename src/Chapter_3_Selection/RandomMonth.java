package Chapter_3_Selection;

/*(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly.*/

public class RandomMonth {

	public static void main(String[] args) {
		// Generate the number
		int number = (int)(Math.random() * 11) + 1;
		System.out.println(number);
		
		//Display the month
		switch (number) {
		case 1: System.out.println("Jan"); break;
		case 2: System.out.println("Feb"); break;
		case 3: System.out.println("Mar"); break;
		case 4: System.out.println("Apr"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("Jun"); break;
		case 7: System.out.println("Jul"); break;
		case 8: System.out.println("Aug"); break;
		case 9: System.out.println("Sep"); break;
		case 10: System.out.println("Oct"); break;
		case 11: System.out.println("Nov"); break;
		case 12: System.out.println("Dec"); break;
		}
			

	}

}
