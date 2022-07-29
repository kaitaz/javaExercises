package Chapter_10_Object_Oriented_Thinking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AproximateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		BigDecimal e = new BigDecimal ("1") ;
		BigDecimal n = new BigDecimal ("1") ;
		BigDecimal item = new BigDecimal ("1") ;
		BigDecimal result = new BigDecimal ("1") ;
		int i = 1;
		
		for(int j = 0; j < num.length; j++) {
			System.out.println("\nValue of e for " + num[j] + ":\t");
			while (i <= num[j]) {
			
				BigDecimal bigInt = BigDecimal.valueOf(i);
				result = result.multiply(bigInt);
				item = n.divide(result, 20, RoundingMode.HALF_EVEN);
				e = e.add(item);
				i++;
				
				}
			i = 1;
			System.out.print(e.setScale(25));
		}
		
	}

}
