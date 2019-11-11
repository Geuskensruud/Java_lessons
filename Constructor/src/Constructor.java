import java.util.Scanner;

class Human {
	//variables
	int year;
	String model;
	String type;
	
	//constructor
	public Human(int year, String model, String type) {
		this.year = year;
		this.model = model;
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
public class Constructor {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("input the model year: ");
		int y1 = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("input the model: ");
		String m1 = s2.nextLine();
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("input the model type: ");
		String t1 = s3.nextLine();
		
		Human c1 = new Human(y1, m1, t1);
		System.out.println(y1 +" "+ m1 +" "+ t1);
	}
}
