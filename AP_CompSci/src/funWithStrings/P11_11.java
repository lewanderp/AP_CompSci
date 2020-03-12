package funWithStrings;

import java.util.*;

public class P11_11 {
    private static double sum = 0;
    private static int notFloatCount = 0;
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter floats: ");
        while(notFloatCount < 2){
            sum(in);
            System.out.println("Enter another float: " );
        }
        System.out.println("Sum of floats: " + sum);
    }

    private static void sum(Scanner in){
        try {
            Double d = in.nextDouble();
            sum+=d;
            notFloatCount = 0;
        } catch (NumberFormatException e){
            System.out.println("Not a number... one more try!");
            notFloatCount++;
        } catch (InputMismatchException e){
            System.out.println("Input mismatched... one more try!");
            notFloatCount++;
        }
    }
    private static double sum(Double d){
        
    }
}