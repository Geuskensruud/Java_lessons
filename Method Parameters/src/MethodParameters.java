
import java.util.Scanner;

class Robot {
	//method
	public void movementJump(String movement, double jump) {
		System.out.println("The robot jumped: " + jump + " meters in the " + movement + " direction");
	}
}

public class MethodParameters {

	public static void main(String[] args) {
		
		//object
		Robot r1 = new Robot();
		Scanner s1 = new Scanner(System.in);
		System.out.println("input the direction: ");
		String move = s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		System.out.println("input the distance: ");
		double dist = s2.nextDouble();
		
		//method
		r1.movementJump(move, dist);
	}
}
