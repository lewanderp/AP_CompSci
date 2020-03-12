package funWithStrings;

import java.util.*;

public class P11_11 {
    private static double sum = 0;
    private static int notFloatCount = 0;
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter floats: ");
        // while(notFloatCount < 2){
        //     sum(in);
        //     System.out.println("Enter another float: " );
        // }
        do {
            sum(in);
            System.out.println("Enter another float: ");
        } while (notFloatCount < 2);
        System.out.println("Sum of floats: " + sum);
    }

    private static void sum(Scanner in){
        try {
            String s = in.next();
            double num = Double.parseDouble(s);
            sum+=num;
            notFloatCount = 0;
        } catch (NumberFormatException e){
            System.out.println("Not a number... one more try!");
            notFloatCount++;
        }
    }
}