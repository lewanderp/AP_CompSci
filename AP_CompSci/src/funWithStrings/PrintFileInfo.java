package funWithStrings;

import java.io.*;
import java.util.*;

public class PrintFileInfo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\Seuss.txt
        
        String fileName = in.next();
        File file = new File(fileName);
        BufferedReader br;
        String st ;
        String str = "";
        System.out.println();
        int numLine = 0;
        int charCount = 0;
        int wordCount = 0;
        try {
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null){
                str+=st;
                str+="\n";
                numLine++;
                charCount+=st.length();
                for(int i =0; i<st.length(); i++){
                    if(isSpace(st.charAt(i))){
                        wordCount++;
                    }
                }
                if(!st.isEmpty()){
                    wordCount++;
                    System.out.println("content");
                } else {
                    wordCount-=2;
                    System.out.println("empty");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(str);
        System.out.println("__________________________________\n");
        System.out.println("Number of lines: " + numLine);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        in.close();
    }
    public static boolean isSpace(char c){
        if (c == 32){
            return true;
        }
        return false;
    }
}