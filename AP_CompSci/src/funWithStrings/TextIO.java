package funWithStrings;

import java.io.FileReader; // input from File
import java.io.IOException; // Exceptions to Input/Output\
import java.util.Scanner;
/**
* Short example to input from File
*/
public class TextIO {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Seuss.txt");
        Scanner in = new Scanner(reader);
        // file must be located in project/package
        int count = 0;
        while (in.hasNext()) // read from input file if there is another String
        {
            System.out.print(in.next() + ""); // print each new string
            count++;
            if (count % 10 == 0)
                System.out.println();
        }
        System.out.println("\nString count " + count);
        Scanner another = new Scanner(System.in);
        in.close(); // close scanner and filereader used to access file
        reader.close();
        another.close();
    }
}