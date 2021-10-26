package ch_12_ExceptionHandling_TextIO;

public class TestTrangleWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TriangleWithException triangle = new TriangleWithException(6, 5, 8);
		
		try {
			
			triangle.setSide1(2);
		}
		
		catch(IllegalTriangleException1 ex) {
			System.out.println(ex);
		}
		
		//catch(IllegalTriangleException2 ex) {
			//System.out.println(ex);
		//}
		
		//catch(IllegalTriangleException3 ex) {
			//System.out.println(ex);
		//}
	}

}
