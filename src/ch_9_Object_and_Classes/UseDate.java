package ch_9_Object_and_Classes;

import java.util.Date;

/*9.3 (Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time*/

public class UseDate {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		for (int i = 3; i <= 10; i++) {
			long elapsedTime = (long) (10 * Math.pow(10, i));
			date.setTime(elapsedTime);
			System.out.println("Time and Date after elapsed " + elapsedTime + " milliseconds is: " +
			date.toString());
		}	

	}

}
