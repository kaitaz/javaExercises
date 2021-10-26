package ch_9_Object_and_Classes;
/*
9.13 (The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array.
  */
public class Location {

	public int row;
	public int column;
	public double maxValue;
	
	public Location() {
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public double getMaxValue() {
		return maxValue;
	}

}
