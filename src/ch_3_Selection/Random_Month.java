package ch_3_Selection;

public class Random_Month {
	
	/*3.4 (Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly.*/

	public static void main(String[] args) {
		// Generate a number
		int number = 1 +(int)(Math.random() * 11);
		System.out.println("Generated number is: " + number);
		
		//Display the month
		switch (number){
			case 1: System.out.println("The month is January."); break;
			case 2: System.out.println("The month is February."); break;
			case 3: System.out.println("The month is March."); break;
			case 4: System.out.println("The month is April."); break;
			case 5: System.out.println("The month is May."); break;
			case 6: System.out.println("The month is June."); break;
			case 7: System.out.println("The month is July."); break;
			case 8: System.out.println("The month is August."); break;
			case 9: System.out.println("The month is September."); break;
			case 10: System.out.println("The month is Octomber."); break;
			case 11: System.out.println("The month is November."); break;
			case 12: System.out.println("The month is December."); 
		}
	}

}
