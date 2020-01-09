package chapter13;

import java.util.Scanner;

public class P13_1{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        String s = in.next();
        System.out.println(reverseSentance(s));
    }
    public static String reverseSentance(String s){
        if (s.length() == 0){
            return "";
        }
        String str = s.charAt(0)+"";
        String toRev = s.substring(1);
        return reverseSentance(toRev)+str;
    }
}