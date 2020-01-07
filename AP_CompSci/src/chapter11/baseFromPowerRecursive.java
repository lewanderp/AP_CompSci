package chapter11;

import java.util.Scanner;

public class baseFromPowerRecursive{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter power: ");
        int pow = in.nextInt();
        System.out.println("Enter base: ");
        int base = in.nextInt();
        System.out.println("Base: " + calcBase(pow, base));
    }
    public static int calcBase(int pow, int base){
        return 0;
    }
}