package chapter14;

import java.util.*;
import chapter14.filesFromDue.*;

public class SearchComparasin{
    public static void main (String [] args){
        int [] numbers = new int[100];
        numbers = numbersInit(numbers).clone();
        System.out.println(printNumbers(numbers));
        
    }

    public static int [] numbersInit(int [] a){
        Random r = new Random();
        for(int i = 0; i<a.length-1; i++){
            a[i] = r.nextInt(100)+1;
        }
        return a;
    }

    public static String printNumbers(int [] a){
        String s ="[ ";
        for(int i: a){
            s+=a[i]+", ";
        }
        return s  += " ]";
    }

}