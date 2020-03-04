package funWithStrings;

import java.util.*;
import java.io.*;

public class encoder {

    private FileWriter fstream;
    private Random r;
    private String toEncode;
    private String eKey[][];

    public encoder() {
        r = new Random();
        eKey = genKey().clone();
    }

    public void encode(String toWriteName, String toReadName) throws IOException {
        toEncode = readFileToEncode(toReadName);
        writeEncodedFile(getEncoded(toEncode), toWriteName);
        writeKeyFile();
    }

    public String getToEncode(){
        return toEncode;
    }

    public String eKeyToString(String[][] key) {
        String toReturn = "[\t";
        for (int i = 0; i < key[0].length; i++) {
            toReturn += key[0][i] + "\t";
        }
        toReturn += "]\n[\t";
        for (int i = 0; i < key[1].length; i++) {
            toReturn += key[1][i] + "\t";
        }
        toReturn += "]";
        return toReturn;
    }

    private String[][] genKey() {
        String [][] key = new String[2][26];
        for (int i = 0; i < key[0].length; i++) {
            String s = r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10);
            key[0][i] = s;
        }
        int cc = 0;
        key[1][25] = " ";
        for (int i = 0; i < key[1].length; i++) {
            char c = (char) (97 + cc);
            String s = c + "";
            key[1][i] = s;
            cc++;
        }
        return key;
    }

    public String getEncoded(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < eKey[0].length; j++) {
                if (str.charAt(i) == eKey[1][j].charAt(0)) {
                    str = str.substring(0, i) + eKey[0][j] + str.substring(i + 1);
                    i += 4;
                    break;
                } else if (str.charAt(i) == ' ') {
                    str = str.substring(0, i) + eKey[0][25] + str.substring(i + 1);
                    i += 4;
                    break;
                }
            }
        }
        return str;
    }

    private String readFileToEncode(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader br;
        String st;
        String str = "";
        br = new BufferedReader(new FileReader(file));
        while ((st = br.readLine()) != null) {
            str += st + "\n";
        }
        br.close();
        return str;
    }

    private void writeEncodedFile(String toWrite, String fileName) throws IOException {
        fstream = new FileWriter(fileName);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(toWrite);
        out.close();
    }

    private void writeKeyFile() throws IOException {
        fstream = new FileWriter("C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\eKey.txt");
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(eKeyToString(eKey));
        out.close();
    }

    
}