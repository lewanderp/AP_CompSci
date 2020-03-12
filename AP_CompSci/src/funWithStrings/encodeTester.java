package funWithStrings;

import java.io.IOException;
import java.util.Scanner;

public class encodeTester {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your own text? (y/n)");
        String s = in.next();
        if(s.equals("n")){
            encoder e = new encoder();
            decoder d = new decoder();
            String toEncode = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\FileToEncode.txt";
            String toWrite = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciEncoded.txt";
            e.encode(toWrite, toEncode);

            String toWriteD = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciDecoded.txt";
            String toDecode = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciEncoded.txt";
            d.decode(toWriteD, toDecode);
        } else {
            System.out.println("Enter Text: ");
            String str = in.next();
            String adress = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\Written"+System.currentTimeMillis()+".txt";
            TextFileWriter tfw = new TextFileWriter(str, adress);
            String toEncode = adress;
            String toWrite = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciEncoded.txt";
            encoder e = new encoder();
            e.encode(toWrite, toEncode);
        }
        in.close();
    }
}