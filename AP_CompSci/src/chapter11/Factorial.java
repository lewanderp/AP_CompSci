package chapter11;

import java.util.Scanner;

public class Factorial{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Iterative Factorial: [Enter Number (int) ]");
        int n = in.nextInt();
        System.out.println("Factoial: " + findFactorial(n));

        System.out.println("Iterative Factorial: [Enter Number (int) ]");
        int toFac = in.nextInt();
        int str = 1;
        for (int i = 0; i<toFac; i++){
            str*= toFac-i;
        }
        System.out.println("Factorial: " + str);
    }
    public static int findFactorial(int n){
        if (n == 0){
            return 1;
        }
        return n*findFactorial(n-1);
    }
}