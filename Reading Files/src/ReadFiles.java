import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args) throws FileNotFoundException {

   String file = "test.txt";

        File txtFile = new File(file);
        Scanner scan = new Scanner(txtFile);
        
        //int value = scan.nextInt();
        //System.out.println("Read value: " + value);
        
        scan.nextLine();

        int i = 0;
        while(scan.hasNextLine() ){

            String line = scan.nextLine();

            System.out.println(i + ": " + line);

            i++;
        }
        scan.close();
    }
}