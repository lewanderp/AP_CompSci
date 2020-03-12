package funWithStrings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

    private String toWrite;
    private String fileName;
    private FileWriter fstream;

    public TextFileWriter(String str, String address) throws IOException {
        toWrite = str;
        fileName = address;
        writeFile();
    }

    private void writeFile() throws IOException {
        fstream = new FileWriter(fileName);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(toWrite);
        out.close();
    }
}