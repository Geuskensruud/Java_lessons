
interface FuncInt {
	int operation(int a, int b);
}
interface FuncString {
	void sayMessage(String message);
}
public class Lambdas {

	private static int performOperation(int a, int b, FuncInt fi) {
		return fi.operation(a, b);
	}
	public static void main(String[] args) {
		
		FuncInt add = (int a, int b) -> a + b;
		FuncInt multiply = (int a, int b) -> a * b;
		FuncInt divide = (int a, int b) -> a/b;
		FuncInt substract = (int a, int b) -> a - b;
		
		System.out.println("add a + b = " + performOperation(4, 5, add));
		System.out.println("add a + b = " + performOperation(4, 5, multiply));
		System.out.println("add a + b = " + performOperation(10, 5, divide));
		System.out.println("add a + b = " + performOperation(10, 5, substract));
		
		FuncString fs = message -> System.out.println("the said message is : " + message);
		fs.sayMessage("hello world");
	}
}
