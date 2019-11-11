import java.util.Scanner;

class Human {
	public void humanSpeak() {
		System.out.println("Hello World!");}
}
interface Robot {
	public void robotSpeak();
}
public class AnonymousClass {

		public static void main(String[] args) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("human(1) or robot(2)?");
			int num = scan1.nextInt();
			int i = num;
			//anonymous class for class Human
			Human h1 = new Human() {@Override public void humanSpeak() {
				System.out.println("Hello World from a Human!");}};
			//anonymous class for interface robot
			Robot r1 = new Robot() {@Override public void robotSpeak() {
					System.out.println("Hello World from a Robot!");}};
			
			if(i == 1) {
				h1.humanSpeak();
			} else if (i == 2) {
				r1.robotSpeak();
			}
		}
}
