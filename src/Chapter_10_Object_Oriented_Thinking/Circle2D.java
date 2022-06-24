package Chapter_10_Object_Oriented_Thinking;

/*(Geometry: the Circle2D class) Define the Circle2D class that contains:
	Two double data fields named x and y that specify the center of the circle
with getter methods.
	A data field radius with a getter method.
	A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
	A constructor that creates a circle with the specified x, y, and radius.
	A method getArea() that returns the area of the circle.
	A method getPerimeter() that returns the perimeter of the circle.
	A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
	A method contains(Circle2D circle) that returns true if the specified
circle is inside this circle (see Figure 10.21b).
	A method overlaps(Circle2D circle) that returns true if the specified
circle overlaps with this circle (see Figure 10.21c).
	Draw the UML diagram for the class then implement the class. Write a test
program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
displays its area and perimeter, and displays the result of c1.contains(3,
3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
Circle2D(3, 5, 2.3)).*/

/*
 UML


 
 Circle2D
 --------
 x: double
 y: double
 radius: double
 
 + Circle2D();
 + Cirecle2D( x: double, y: double, radius: double);
 + getX(): double
 + getY(); double
 + getRadius(): double
 + getArea(): double
 + getPerimeter(): double
 + contains(x: double, y: double) : boolean
 + contains(circle: Circle2D) : boolean
 + overlaps(circle: Circle2D) : boolean
 
 c1: Circle2D
 ---------
  x = 2
  y = 2
  radius 5.5
  
  c2: Circle2D
 ---------
  x = 4
  y = 5
  radius 10.5
  
  c3: Circle2D
 ---------
  x = 3
  y = 5
  radius 2.3
  
  
 * */

public class Circle2D {
	
	double x;
	double y;
	double radius;
	
	Circle2D(){
		x = 0;
		y = 0;
		radius = 1;		
	}
	
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	boolean contains(double x, double y) {
		//Calculate the distance between point and center of circle
		double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) );
		//compare with radius
		if(distance <= this.radius) 
			return true; 
		else 
			return false;
	}

	boolean contains(Circle2D circle) {
		//Calculate the distance between center of this.circle and circle plus circle radius
		double distance = (Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) + circle.radius );
		//compare with radius
		if(distance <= this.radius) 
			return true; 
		else 
			return false;	
	}
	
	boolean overlaps(Circle2D circle) {
		//Calculate the distance between this.center of circle and center of the circle
		double distance = (Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) );
		//compare with radius plus circle radius
		if(distance <= this.radius + circle.radius) 
			return true; 
		else 
			return false;
		
	}

}
