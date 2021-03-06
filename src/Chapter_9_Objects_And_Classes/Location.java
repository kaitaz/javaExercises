package Chapter_9_Objects_And_Classes;
/*(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array.*/

/*
 UML
 
 Location
 -----------
 row: int
 column: int
 maxValue: double
 
 + Location(row: int, column: int, maxValue: double);
 
 * */

public class Location {
	int row;
	int column;
	double maxValue;
	
	Location(int row, int column, double maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

}
