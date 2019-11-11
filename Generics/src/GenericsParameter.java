import java.util.ArrayList;
import java.util.Scanner;

class Machine {
	public String toString() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Which action is performed?");
		String action = scan1.nextLine();
		return action;
	}
}
public class GenericsParameter {

	public static void main(String[] args) {
		ArrayList<Machine> machAction = new ArrayList<Machine>();
		machAction.add(new Machine());
		machAction.add(new Machine());
		System.out.println(machAction);
		
	}
}
