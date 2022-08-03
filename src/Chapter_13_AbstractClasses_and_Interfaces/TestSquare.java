package Chapter_13_AbstractClasses_and_Interfaces;

public class TestSquare {

	public static void main(String[] args) {
		GeometricObject[] objects = {new Square(), new Square(1), new Square(2), 
				new TriangleClass(), new TriangleClass(2, 3, 4, "green", true) };
		
		
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Colorable) {
				System.out.println(objects[i].toString());
				((Colorable) objects[i]).howToColor();}
		}
		
		for (int i = 0; i < objects.length; i++) {
			System.out.println("\n" + objects[i].toString() + " has are: " + objects[i].getArea() + ", has perimeter: " + objects[i].getPerimeter() 
			+ "\nIt has the color " + objects[i].getColor() + " and is filled: "+ objects[i].isFilled());
		}
	}

}
