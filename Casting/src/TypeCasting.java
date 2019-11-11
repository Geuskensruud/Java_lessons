
public class TypeCasting {

	public static void main(String[] args) {
		int myInt1 = 9;
		double myDouble1 = 9.0;
		int myInt2 = 11;
		double myDouble2 = 11.0;
		//widening --> int to double
		double myDouble3 = myInt1;
		//narrowing --> double to int
		int myInt3 = (int) myDouble1;
		
		System.out.println(myDouble3);
		System.out.println(myInt3);
	}

}
