import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//create scanner
		Scanner scan = new Scanner(System.in);

		//Before input string
		System.out.println("enter the value");
		
		//input value
		String myString = scan.nextLine();
		
		//output
		System.out.println("you entered: " + myString);
	}

}
