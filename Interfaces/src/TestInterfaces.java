import java.util.Scanner;

interface Animal{
	public void eat();
	public int sleep();
}
class Dog implements Animal{

	@Override
	public void eat() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("What does the dog eat?");
		String dogEat = scan1.nextLine();
		System.out.println("the dog eats: " + dogEat);
	}
	@Override
	public int sleep() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("How long does the dog sleep?");
		int dogSleep = scan2.nextInt();
		System.out.println("the dog sleeps for : " + dogSleep + " hours");
		return dogSleep;
	}
}
public class TestInterfaces {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); d.sleep();
	}
}
