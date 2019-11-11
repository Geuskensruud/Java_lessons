import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExcep {

	public static void main(String[] args) throws FileNotFoundException, IllegalAccessException  {
		File file = new File("text.txt");
		FileReader fr = new FileReader(file);
		
	}

}
