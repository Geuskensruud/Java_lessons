import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateWrite {

	public static void main(String[] args) {
		File f = new File("text.txt");
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		// try with resource block
		try (BufferedWriter b = new BufferedWriter(new FileWriter(f))) {
			int t = 1;	
			while (t > 0) {
				String l = s1.nextLine();
				b.write(l);
				b.newLine();
				System.out.println(l);
				int t1 = s2.nextInt();		
				if(t1 == 1) {
				}else if(t1 == 0){
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File: " + f + " could not be read");
		}
	}
}
