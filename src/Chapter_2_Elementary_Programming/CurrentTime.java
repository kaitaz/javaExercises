package Chapter_2_Elementary_Programming;

import java.util.Scanner;

/*ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone*/

public class CurrentTime {

	public static void main(String[] args) {
		
	    // Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;
	    
	    //Take user input
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the time zone offset to GTM: ");
	    int offset = input.nextInt();
	    
	    //Compute offset Hour
	    long offsetHour = (totalHours + offset) % 24;
	    

	    // Display results
	    System.out.println("Current GTM time is " + currentHour + " and offset time is " + offsetHour);
	  

	}

}
