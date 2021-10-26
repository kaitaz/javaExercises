package ch_12_ExceptionHandling_TextIO;

public class IllegalTriangleException1 extends Exception {
	private double side;
	
	
	public IllegalTriangleException1(double side) {
		super("Illegal triangle. Wrong dimensions " + side );
		this.side = side;
		
	}
	
	public double getSide() {
		return side;
		
	}

	
}

class IllegalTriangleException2 extends Exception {
	private double side;
	
	
	public IllegalTriangleException2(double side) {
		super("Illegal triangle. Wrong dimensions " + side );
		this.side = side;
		
	}
	
	public double geSside() {
		return side;
		
	}

	
}

class IllegalTriangleException3 extends Exception {
	private double side;
	
	
	public IllegalTriangleException3(double side) {
		super("Illegal triangle. Wrong dimensions " + side );
		this.side = side;
		
	}
	
	public double getSide() {
		return side;
		
	}

	
}
