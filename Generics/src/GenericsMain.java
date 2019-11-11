import java.util.ArrayList;
import java.util.Scanner;

public class GenericsMain {

	public static void main(String[] args) {
		int y = 0;
		//ArrayList
		ArrayList<String> fruit = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
	
		while(y<1) {
			System.out.println("Input new fruit");
			//add fruits
			String inputFruit = scan.nextLine();
			fruit.add(inputFruit);
			System.out.println(fruit); System.out.println("Do you want to add another fruit?");
			String command = scan2.nextLine();
			
			switch(command) {
			case "y":
				y=0; break;
			case "n":
				y=1; break;
			}
		}
		System.out.println("end list" + fruit);
	}
}
