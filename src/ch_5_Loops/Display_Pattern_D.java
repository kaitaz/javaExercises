package ch_5_Loops;

public class Display_Pattern_D {
	
/*
 * 5.18 (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
1 2 3 4 5 6 
  1 2 3 4 5 
    1 2 3 4 
      1 2 3 
        1 2 
          1 
*/

	public static void main(String [] args) {
		int n = 6;
		int i, j, k;
		
	for (i = 0; i <= n; i++) {
		
		for (j = 1 ; j <= i; j++) {
			System.out.print("  ");
		}
		
		for (k = 1; k <= n-i; k++) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
	} 
}
}