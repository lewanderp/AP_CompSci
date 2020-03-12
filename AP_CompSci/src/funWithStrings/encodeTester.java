package funWithStrings;

import java.io.IOException;

public class encodeTester {
    public static void main(String[] args) throws IOException {
        encoder e = new encoder();
        decoder d = new decoder();
        String toEncode = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\FileToEncode.txt";
        String toWrite = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciEncoded.txt";
        e.encode(toWrite, toEncode);

        String toWriteD = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciDecoded.txt";
        String toDecode = "C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\CompSciEncoded.txt";
        d.decode(toWriteD, toDecode);
    }
}