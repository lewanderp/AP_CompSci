package chapter11;

import java.util.Scanner;

public class FibonacciRecursive{
    public static void main (String [] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Which iteration of the fibonacci series do you want?");
        int toGen = in.nextInt();
        System.out.println(genFib(toGen));
    }
    public static int genFib(int n){
        if (n <= 1){
            return n;
        }
        return genFib(n-1) + genFib(n-2);
    }
}