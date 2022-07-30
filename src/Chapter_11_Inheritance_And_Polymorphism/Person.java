package Chapter_11_Inheritance_And_Polymorphism;

/*(The Person, Student, Employee, Faculty, and Staff classes) Design a class
		named Person and its two subclasses named Student and Employee. Make
		Faculty and Staff subclasses of Employee. A person has a name, address,
		phone number, and e-mail address. A student has a class status (freshman, sophomore,
		junior, or senior). Define the status as a constant. An employee has an
		office, salary, and date hired. Use the MyDate class defined in Programming
		Exercise 10.14 to create an object for date hired. A faculty member has office
		hours and a rank. A staff member has a title. Override the toString method in
		each class to display the class name and the person’s name.
		 Write a test program
		that creates a Person, Student, Employee, Faculty, and Staff, and invokes
		their toString() methods.*/

public class Person {
	String name = "PERSON";
	String address;
	int phone;
	String email;
	
	Person(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return  name + "\tPerson";
		
	}

}

class Student extends Person{
	final String[] STATUS = {"freshman", "sophomore", " junior", "senior"};
	
	Student(){
		setName("STUDENT");
	}
	
	
	
	public String toString() {
		return getName() +   "\tStudent";
		
	}
}

class Employee extends Person{
	String office;
	double salary;
	java.util.Date dateHired = new java.util.Date();
	
	Employee(){
		setName("EMPLOYEE");
	}
	
	
	
	public String toString() {
		return getName() +   "\tEmployee";
		
	}
}

class Faculty extends Employee{
	String rank;
	int officeHours;
	
	Faculty(){
		setName("FACULTY");
	}
	
	
	
	public String toString() {
		return getName() +   "\tFaculty";
		
	}
}

class Staff extends Employee{
	String title;
	
	Staff(){
		setName("STAFF");
	}
	
	
	
	public String toString() {
		return getName() +   "\tStaff";
		
	}
}
