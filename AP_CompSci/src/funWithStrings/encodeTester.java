package funWithStrings;

import java.io.IOException;

public class encodeTester {
    public static void main(String[] args) throws IOException {
        encoder e = new encoder();
        String toEncode = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\FileToEncode.txt";
        String toWrite = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciEncoded.txt";
        e.encode(toWrite, toEncode);
    }
}