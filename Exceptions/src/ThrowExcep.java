
public class ThrowExcep {

	public static void checkAge(int age) {
		if(age <18) {
			throw new ArithmeticException("Access denied " + age + " is under 18");
		}else {
			System.out.println("Access granted " + age + " is above 18");
		}
	}
	public static void main(String[] args) {
		checkAge(20);
		checkAge(16);

	}

}
