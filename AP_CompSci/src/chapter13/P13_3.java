package chapter13;

import java.util.Scanner;

public class P13_3{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        String s = in.next();
        String toRev = "";
        for(int i = 0; i<s.length()/2; i++){
            String str = s.charAt(i)+"";
            toRev = s.substring(1);
            s = s + toRev + str;

        }   
        System.out.println(s);
    }
}