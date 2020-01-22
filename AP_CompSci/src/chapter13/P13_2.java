package chapter13;

import java.util.Scanner;

public class P13_2{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        System.out.println("Enter a string to be reversed");
        String s = in.next();
        System.out.println(reverse(s));
    }
    public static String reverse(String s){ 
        return reverse(s);
        //#TODO finish this lol, imaine explain what this does or spelling lol fukin die
    }
    private String reverse(String s, int st, int en){
        if (s.length()  == 0){
            return "";
        }
        String str = s.charAt(0)+"";
        String toRev = s.substring(1);
        return reverse(toRev, st, en)+str;
    }
}