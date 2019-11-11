
class Person {
	// variables
	String name;
	int age;

	// method
	void speakNameAndAge() {
		System.out.println("Hello my name is " + name + " and my age is " + age);
	}
}

public class Methods {

	public static void main(String[] args) {
		// new object
		Person p1 = new Person();
		p1.name = "John";
		p1.age = 30;
		//method
		p1.speakNameAndAge();
		// second object
		Person p2 = new Person();
		p2.name = "Jane";
		p2.age = 35;
		//method
		p2.speakNameAndAge();
	}
}
