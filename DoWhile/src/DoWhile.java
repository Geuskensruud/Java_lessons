import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int myInt = 0;
		
		Scanner scan = new Scanner(System.in);
		//do
		do {
			System.out.println("you entered: ");
			myInt = scan.nextInt();
		}
		while(myInt != 5);
		
		System.out.println("you entered 5");

	}

}
