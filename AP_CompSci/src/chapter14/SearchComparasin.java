package chapter14;

import java.util.*;
import chapter14.filesFromDue.binsearch.BinarySearcher;
import chapter14.filesFromDue.linsearch.LinearSearcher;

public class SearchComparasin{
    public static void main (String [] args){
        Random r = new Random();
        int [] numbers = new int[100];
        int tosearch = r.nextInt(numbers.length-1);
        numbers = numbersInit(numbers).clone();
        System.out.println(printNumbers(numbers)+"\n");
        LinearSearcher ls = new LinearSearcher(numbers);
        ls.search(numbers[tosearch]);
        System.out.println("Linear Searcher Found number " + numbers[tosearch] + " at index " + ls.search(numbers[tosearch]));
        System.out.println("Comparasins for Linear Searcher: " + ls.getComparasins());
        
        Arrays.sort(numbers);
        System.out.println("\n" + printNumbers(numbers)+"\n");
        BinarySearcher bs = new BinarySearcher(numbers);
        bs.search(numbers[tosearch]);
        System.out.println("Binary Searcher Found number " + numbers[tosearch] + " at index " + bs.search(numbers[tosearch]));
        System.out.println("Comparasins for Binary Searcher: " + bs.getComparasins());
        
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
        for(int i = 0; i<a.length-1; i++){
            s+=a[i]+", ";
        }
        return s  += " ]";
    }

}