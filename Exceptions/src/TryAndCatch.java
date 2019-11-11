import java.io.IOException;
import java.text.ParseException;

class Test {
    public void run() throws IOException, ParseException {        
        //throw new IOException();       
        throw new ParseException("Error in command list.", 0);  
    }
}
public class TryAndCatch {

	public static void main(String[] args) {
        Test test = new Test();
        // Multiple catch blocks
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
	}
}
