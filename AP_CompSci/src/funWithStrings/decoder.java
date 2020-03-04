package funWithStrings;

import java.util.*;
import java.io.*;

public class decoder{
    
    private FileWriter fstream;
    private Random r;
    private String toEncode;
    private String eKey[][];

    public decoder(){

    }
    private void seteKey(String keyLocation) throws IOException {
        eKey = new String[2][26];
        BufferedReader br;
        String st;
        br = new BufferedReader(new FileReader(keyLocation));
        while ((st = br.readLine()) != null) {
            int ic = 0;
            for(int i =0; i<st.length(); i++){
                if(st.charAt(i)=='}' || st.charAt(i)=='{'){
                } else {

                }
            }
        }
        br.close();   
    }
}