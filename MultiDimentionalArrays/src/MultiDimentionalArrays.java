
public class MultiDimentionalArrays {

	public static void main(String[] args) {
		//array
		int myInt[][]= {{1,2,3,4},{9,8,7}};
		int a = myInt[0][1];
		int b = myInt[0][2];
		int c = myInt[1][1];
		
		System.out.println(a + b + c);
		System.out.println(a +" "+ b +" "+ c);
		//for loop to get all values of i (rows) so 2 rows
		for(int i=0; i<myInt.length; ++i) {
			//for loop to get all values of the columns (j) of the rows(i), so 7 values
			for(int j=0; j<myInt[i].length; ++j) {
				System.out.println(myInt[i][j]);
			}
		}

	}

}
