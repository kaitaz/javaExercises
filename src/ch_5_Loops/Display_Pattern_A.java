package ch_5_Loops;

public class Display_Pattern_A {
	
/*
 * 5.18 (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
*/

	public static void main(String [] args) {
		int n = 6;
		
	for (int i = 1; i <= n; i++) {
		
		for (int j = 1 ; j <= i; j++) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		
	} 
}
}
