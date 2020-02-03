package chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingArrayLists{
    public static ArrayList<Integer> a = new ArrayList<>();
    public static Random r = new Random();

    public static void main (String [] args){
        intiA();
        System.out.println("Original ArrayList");
        System.out.println(a);
        System.out.println("Sorted Array");
        Collections.sort(a);
        System.out.println(a);
        System.out.println("Median: " + findMed());

    }
    public static void intiA(){
        for(int i =0; i<5;i++){
            a.add(r.nextInt(50)+1);
        }
    }
    public static int findMed(){
        if (a.size()%2 == 0){
            int x  = a.get(a.size()/2-2);
            int y = a.get(a.size()/2+1);
            return (x+y)/2;
        } else {
            int x = a.get(a.size()/2);
            return x;
        }
    }

}