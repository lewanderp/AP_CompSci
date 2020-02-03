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

    }
    public static void intiA(){
        for(int i =0; i<5;i++){
            a.add(r.nextInt(50)+1);
        }
    }

}