package ch_9_Object_and_Classes;

import java.util.Date;

/*9.6 (Stopwatch) Design a class named StopWatch. The class contains:
	Private data fields startTime and endTime with getter methods.
	A no-arg constructor that initializes startTime with the current time.
	A method named start() that resets the startTime to the current time.
	A method named stop() that sets the endTime to the current time.
	A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.*/

/*UML
 	- startTime
 	- endTime
 	-------------
 	StopWatch()
 	start()
 	stop()
 	getElapsedTime()
 */

public class StopWatch {
	
	private long startTime;
	private long endTime;
	
	public void setStartTime( long startTime) {
		this.startTime = startTime;
	}
	
	public void setEndTime( long endTime) {
		this.endTime = endTime;
	}
	
	public long startTime() {
		return startTime;
		
	}
	
	public long stopTime() {
		return endTime;
		
	}
	
	public long getElapsedTime() {
		return endTime - startTime ;
	}


}
