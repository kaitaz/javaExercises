package Chapter_9_Objects_And_Classes;
import java.math.BigInteger;
import java.util.Date;

public class TestDateClass {

	public static void main(String[] args) {
		// Create a date object
		long[] elapsedTime = new long[8];
		
		elapsedTime[0] = 10000;
		elapsedTime[1] = 100000;
		elapsedTime[2] = 1000000;
		elapsedTime[3] = 10000000;
		elapsedTime[4] = 100000000;
		elapsedTime[5] = 1000000000;
		elapsedTime[6] = 10000000000L;
		elapsedTime[7] = 100000000000L;
		
		
		Date date = new Date();
		System.out.println("Current elapsed miliseconds are " + date.getTime() + " and current date is "
		+ date.toString());
		System.out.println("Miliseconds          Date");
		
		for(int i = 0; i < elapsedTime.length; i++) {
			date.setTime(elapsedTime[i]);
			System.out.printf("%-20d %s\n", elapsedTime[i], date.toString());
			
		}

	} 

}
