package chapter14;

import java.util.Arrays;
import java.util.Random;

public class SortingArrays{
    public static Random r = new Random();
    public static int[] ar = {r.nextInt(50)+1, r.nextInt(50)+1, r.nextInt(50)+1, r.nextInt(50)+1, r.nextInt(50)+1, r.nextInt(50)+1};

    public static void main(String [] args){
        System.out.println("Original Array: ");
        System.out.println(printA());
        System.out.println("Sorted Array");
        Arrays.sort(ar);
        System.out.println(printA());
        System.out.println("Median: " + findMed());
    }
    public static String printA(){
        String s = "";
        s+="[ ";
        for(int i =0; i< ar.length-2; i++) {
            s+=ar[i]+", ";
        }
        s+=ar[ar.length-1]+" ]";
        return s;
    }
    public static int findMed(){
        int x = ar[ar.length/2-1];
        return x;
    }
}