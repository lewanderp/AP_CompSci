package funWithStrings;

import java.io.*;

public class decoder {

    private FileWriter fstream;
    private String toDecode;
    private String eKey[][];

    public decoder() {

    }

    public void decode(String toWriteName, String toReadName) throws IOException {
        seteKey("C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\eKey.txt");
        toDecode = readFileToDecode(toReadName);
        writeDecodedFile(getDecoded(toDecode), toWriteName);
    }

    private void seteKey(String keyLocation) throws IOException {
        eKey = new String[2][26];
        BufferedReader br;
        String st;
        br = new BufferedReader(new FileReader(keyLocation));
        st = br.readLine();
        int cc = 1;
        for (int i = 1; i < eKey[0].length; i++) {
            if (st.charAt(cc - 1) == '\t') {
                eKey[0][i] = st.substring(cc, cc + 5);
                cc += 5;
            }
            cc++;
        }
        cc = 0;
        eKey[1][25] = " ";
        for (int i = 0; i < eKey[1].length; i++) {
            char c = (char) (97 + cc);
            String s = c + "";
            eKey[1][i] = s;
            cc++;
        }
        br.close();
    }

    private String readFileToDecode(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader br;
        String st;
        String str = "";
        br = new BufferedReader(new FileReader(file));
        while ((st = br.readLine()) != null) {
            str += st + "\n";
        }
        br.close();
        //System.out.println(str);
        return str;
    }

    private String getDecoded(String st) {
        // for (int i = 0; i < st.length(); i++) {
        //     String str = st.substring(i, i + 5);
        //     //System.out.println(str);
        //     for (int j = 0; j < eKey[0].length; j++) {
        //         if (str.equals(eKey[0][j])) {
        //             System.out.println(str);
        //             str = eKey[1][j];
        //             System.out.println(str);
        //         }
        //         if(str.charAt(i)){
        //             st = str + st.substring(i + 1);
        //         } else {
        //             st = st.substring(0, i - 1) + str + st.substring(i + 1);
        //         }
        //     }
        // }
        //System.out.println(st);

        for(int i =0; i< st.length(); i++){
            for(int j = 2; j< eKey[0].length; j++){
                String str = st.substring(i, i+5);
                if(str.equals(eKey[0][j])){
                    st = st.substring(0, i) + eKey[1][j] + st.substring(i+2, st.length());
                    break;
                }
            }
        }
        System.out.println(st);
        return st;
    }

    private void writeDecodedFile(String toWrite, String fileName) throws IOException {
        fstream = new FileWriter(fileName);
        BufferedWriter out = new BufferedWriter(fstream);
        System.out.println(toWrite);
        out.write(toWrite);
        out.close();
    }
}