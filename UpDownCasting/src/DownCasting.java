interface Mammal {
	public void eat();
	public void makeNoise();
}
class Animal implements Mammal {
	public void eat() {System.out.println("Eat");	}
	public void makeNoise() {System.out.println("Noise");		}
}
class Dog extends Animal {
	public void eat() {System.out.println("dog eats");}
	public void makeNoise() {System.out.println("dog makes noise");}
}
class Cat extends Animal {
	public void eat() {System.out.println("cat eats");}
	public void makeNoise() {System.out.println("cat makes noise");}
}
public class DownCasting {

	public static void main(String[] args) {
		//upCasting
		Dog d = new Dog();
		Animal a = (Animal) d;
		a.eat(); a.makeNoise();
		//downCasting
		Animal a1 = new Cat();
		Cat c = (Cat) a1;
		c.eat(); c.makeNoise();
	}
}
