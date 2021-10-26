package ch_5_Loops;

public class Display_Pattern_C {

	
/*5.18 (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
          1 
        2 1 
      3 2 1 
    4 3 2 1 
  5 4 3 2 1 
6 5 4 3 2 1 
*/
	
	public static void main(String[] args) {
		// PAtern A
		
		int n = 6;
		int i, j, k;
		for (i = 1; i <= n; i++) {
			
			for (j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			
			for (k = 0 + i ; k >= 1; k--) {
				System.out.print(k + " ");
			}
			
			System.out.println();
			
		} 

	}

}