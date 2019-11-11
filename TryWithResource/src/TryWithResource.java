import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		File f = new File("text.txt");
		
		//try with resource block
		try(BufferedReader b = new BufferedReader(new FileReader(f))){
			String l;
			
			while((l = b.readLine()) != null) {
				System.out.println(l);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File: " + f + " not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File: " + f + " could not be read");
		}

	}

}
