class Animals {
	public void eat() {System.out.println("animal eats");}
}
class Dog extends Animals {
	public void bark() {System.out.println("dog barks");}
	public void eat() {System.out.println("dog eats");}
}
class Cat extends Animals {
	public void purr() {System.out.println("cat purrs");}
	public void eat() {System.out.println("cat eats");}
}
public class Inheritence {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.bark();  d.eat();
		c.eat();  c.purr();
	}
}
