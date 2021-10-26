package ch_4_Math_Char_String;

import java.util.Scanner;
/*4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
in which all sides are of the same length and all angles have the same degree (i.e.,
the polygon is both equilateral and equiangular).*/

public class Area_of_Polygon {

	public static void main(String[] args) {
		
		// Get the input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of side: ");
		int side = input.nextInt();
		System.out.print("Enter the lenght of a side: ");
		double lenght = input.nextDouble();
		
		//Process the input
		double area = (side * Math.pow(lenght, 2)) / (4 * Math.tan((Math.PI / side)));
		
		// Display area
		System.out.printf("Area of polygon is %.3f", area);
	}

}
