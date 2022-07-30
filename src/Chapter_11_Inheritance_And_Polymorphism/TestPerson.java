package Chapter_11_Inheritance_And_Polymorphism;

public class TestPerson {

	public static void main(String[] args) {
		displayPerson(new Person());
		displayPerson(new Student());
		displayPerson(new Employee());
		displayPerson(new Faculty());
		displayPerson(new Staff());
		

	}
	
	public static void displayPerson(Person person) {
		System.out.println(person.toString());
		
	}

}
