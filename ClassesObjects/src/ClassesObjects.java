class Person {
	//variables
	String name;
	int age;
}

public class ClassesObjects {

	public static void main(String[] args) {
		
		//new object
		Person p1 = new Person();
		p1.name = "John";
		p1.age = 30;
		//second object
		Person p2 = new Person();
		p2.name = "Jane";
		p2.age = 35;
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		

	}

}
