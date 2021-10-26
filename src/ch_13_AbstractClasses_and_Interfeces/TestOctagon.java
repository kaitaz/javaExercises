package ch_13_AbstractClasses_and_Interfeces;

import Imported_Class.GeometricObjectAbstract;

/* Write a test program that creates an Octagon object with side
value 5 and displays its area and perimeter. Create a new object using the clone
method, and compare the two objects using the compareTo method.*/

public class TestOctagon {

	public static void main(String[] args) {
		String [] compare = {"equal", "smaller", "larger"};
		Octagon octagon1 = new Octagon(5, "blue", true);
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		display(octagon1);
		display(octagon2);
		
		System.out.println("Octagon 1 is "+ compare[octagon1.compareTo(octagon2)] + " than Octagon 2." );
		
	}
	
	public static void display(Octagon octagonObj) {
		System.out.println(octagonObj.toString() );
			
	}

}
