import java.util.Scanner;

class Person {
	// variables
	String name;
	int age;
	//getter
	String getName() {
		return name;
	}
	//setter
	public void setName(String newName) {
		this.name = newName;	
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		// new object
		Person p1 = new Person();
		Scanner s1 = new Scanner(System.in);
		System.out.println("input the new Name: ");
		String n1 = s1.nextLine();
		p1.setName(n1); 
		String name = p1.getName();
		System.out.println("the new name is: " + name);
	}
}

