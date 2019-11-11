package toString;

class Animals {
	//variables
	String name;
	double age;
	String gender;
	
	//constructor
	Animals(String name, double age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	//toString method
	@Override
	public String toString() {
		return "Animals [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ToString {

	public static void main(String[] args) {
		Animals a1 = new Animals("dog", 4, "M");
		System.out.println(a1);
	}
}
