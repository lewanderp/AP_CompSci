package funWithStrings;

import java.io.*; // Exceptions to Input/Output\
/**
* Short example to input from File
*/
public class TextIO {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\Seuss.txt");
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String st; 
        while ((st = br.readLine()) != null) 
            System.out.println(st);
        br.close();
    }
}