package chapter14;

import java.util.Arrays;
import java.util.Random;

public class CommercialSort{

    public static Commercial a []= new Commercial[5];
    public static Random r = new Random();
    public static void main(String [] args){
        initA();
        System.out.println("Original Array");
        System.out.println(printA());
        System.out.println("Sorted Array");
        Arrays.sort(a);
        System.out.println(printA());
        System.out.println("Median: ");
        System.out.println(getMedian());
    }
    public static void initA(){
        for(int i = 0; i<a.length; i++){
            a[i] = new Commercial("Product: " + (i+1));
            a[i].showCommercial(r.nextInt(20)+1);
        }
    }
    public static String printA(){
        String s = "[ ";
        for(int i =0; i< a.length-2; i++){
            s+=a[i].toString()+", \n";
        }
        s+=a[a.length-1].toString()+" ]";
        return s;
    }
    public static Commercial getMedian(){
        return a[a.length-1];
    }

}