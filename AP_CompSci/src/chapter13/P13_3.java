package chapter13;

import java.util.Scanner;

public class P13_3{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        System.out.println("Enter a string to be reversed");
        String s = in.next();
        String str = "";
        for(int i = 0; i<s.length(); i++){
            str = str + s.charAt(s.length()-(1+i));
        }   
        System.out.println(str);
    }
}