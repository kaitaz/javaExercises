package ch_9_Object_and_Classes;

import java.util.Random;
import java.util.Calendar;


public class StopWatchTest {

	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		Random random = new Random();
		int[] list = new int[100000];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt();
			}
		
		
		
		stopwatch.setStartTime(calendar1.getTimeInMillis());
		
		selectionSort(list);
	
		stopwatch.setEndTime(calendar2.getTimeInMillis());
		
		System.out.println(stopwatch.getElapsedTime()  + " ms");

	}
	
	  public static void selectionSort(int[] list) {
		    for (int i = 0; i < list.length - 1; i++) {
		      // Find the minimum in the list[i..list.length-1]
		      double currentMin = list[i];
		      int currentMinIndex = i;

		      for (int j = i + 1; j < list.length; j++) {
		        if (currentMin > list[j]) {
		          currentMin = list[j];
		          currentMinIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMinIndex] if necessary;
		      if (currentMinIndex != i) {
		        list[currentMinIndex] = list[i];
		        list[i] = (int) currentMin;
		      }
		    }
		  }

}

