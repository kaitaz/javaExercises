package ch_5_Loops;

public class Compute_Futere_Tuition {

	/*5.7 (Financial application: compute future tuition) Suppose the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition will
be $10,500. Write a program that displays the tuition in 10 years, and the total
cost of four years’ worth of tuition starting after the tenth year.*/
	
	public static void main(String[] args) {
		
		// Inputs and outputs
		double amount = 10000;
		double rate = 0.05;
		double tuition, cost = 0, sum = 0;
		
		// Calculate tuition and cost
		tuition = amount * Math.pow((1 + rate), 10);
		cost = tuition;
		
		for (int i = 1; i <= 4; i++) {
			cost = cost * Math.pow((1 + rate), 1);
			sum = sum + cost;
		
		}
		
		//Display the outputs
		System.out.printf("Tuition after ten years is: %.2f\n", tuition);
		System.out.printf("Cost for four years after ten years is: %.2f", sum);
	}		
}
