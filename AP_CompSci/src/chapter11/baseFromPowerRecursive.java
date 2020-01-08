package chapter11;

import java.util.Scanner;

public class BaseFromPowerRecursive{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter power: ");
        int pow = in.nextInt();
        System.out.println("Enter base: ");
        int base = in.nextInt();
        System.out.println("Base: " + calcBase(pow, base));
    }
    public static String calcBase(int pow, int base){
        if (pow == 1){
            return base + "";
        }
        return base + "*" + calcBase(pow-1, base);
    }
}