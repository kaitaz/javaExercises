package Chapter_5_Loops;

/*(Financial application: compute future tuition) Suppose the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition will
be $10,500. Write a program that displays the tuition in 10 years, and the total
cost of four years’ worth of tuition starting after the tenth year.*/

public class ComputeFutureTuition {
	public static void main(String[] args) {
		
		double presentValue = 10000;
		double rate = 0.05;
		double futureValue;
		double totalTuition = 0;
		
		futureValue = presentValue * Math.pow(1 + rate, 10);
		System.out.printf("The tuition after 10 years is%10.2f", futureValue);
		presentValue = futureValue;
		
		for (int i = 0; i < 4; i++) {
			futureValue = presentValue * Math.pow(1 + rate, 1);
			presentValue = futureValue;
			totalTuition += futureValue;
			
		}
		System.out.printf("\nThe total cost for the next 4 years is%10.2f", totalTuition);
	}
}
