package chapter14;

import java.util.ArrayList;
import java.util.Scanner;

public class Review2{
    private static ArrayList<String> a = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);
    public static void main (String [] args){
        aInit();
        System.out.println(a);
        System.out.println("\nEnter 2 Vegetables");
        String v1 = in.next();
        String v2 = in.next();
        System.out.println("Swapped 'em");
        swapVegetables(v1, v2);
        System.out.println(a);
        System.out.println("Max and Min Alphabetically Swapped");
        swapMaxMinAlphebetically();
        System.out.println(a);
        System.out.println("Shortest and Longest Vegetables Swapped");
        swapShortestLongestVegetables();
        System.out.println(a);
        System.out.println("Array List in 2 parts");
        System.out.println(breakArrayList()[0][0]);
        System.out.println(breakArrayList()[0][1]);
    }
    public static void aInit(){
        a.add("Carrot");
        a.add("Broccoli");
        a.add("Cabbage");
        a.add("Cauliflower");
        a.add("Bussle_Sprouts");
        a.add("Wild_Cabbage");
        a.add("Potato");
        a.add("Sweet_Potato");
    }
    public static void swapVegetables(String v1, String v2){
        String str = a.get(findVegetableIndex(v1));
        int v1i = findVegetableIndex(v1);
        int v2i = findVegetableIndex(v2);
        a.set(v1i, v2);
        a.set(v2i, str);
    }
    private static int findVegetableIndex(String v){
        for (int i = 0; i<a.size()-1; i++){
            if (a.get(i).equals(v)){
                return i;
            }
        }
        return -1;
    }
    public static void swapMaxMinAlphebetically(){
        swapVegetables(getMaxAlphabetically(), getMinAlphabetically());
    }
    private static String getMaxAlphabetically(){
        int maxIndx = 0;
        for(int i = 0; i < a.size()-1; i++){
            if(a.get(i).compareTo(a.get(maxIndx))>0) {
                maxIndx=i;
            }
        }
        return a.get(maxIndx);
    }
    private static String getMinAlphabetically(){
        int minIndx = 0;
        for(int i = 0; i < a.size()-1; i++){
            if(a.get(i).compareTo(a.get(minIndx))<=0) {
                minIndx=i;
            }
        }
        return a.get(minIndx);
    }
    public static void swapShortestLongestVegetables(){
        swapVegetables(findShortestVegetable(), findLongestVegetable());
    }
    private static String findShortestVegetable(){
        int shrtIndx  = 0;
        for(int i =0; i<a.size()-1; i++){
            if(a.get(i).length() < a.get(shrtIndx).length()){
                shrtIndx = i;
            }
        }
        return a.get(shrtIndx);
    }
    private static String findLongestVegetable(){
        int lngIndx  = 0;
        for(int i =0; i<a.size()-1; i++){
            if(a.get(i).length() > a.get(lngIndx).length()){
                lngIndx = i;
            }
        }
        return a.get(lngIndx);
    }
    public static ArrayList<String>[][] breakArrayList(){
        ArrayList <String> b = new ArrayList<>();
        ArrayList <String> c = new ArrayList<>();
        //TODO research this wierd ass warning
        ArrayList <String> [][] d = new ArrayList[1][2];
        d[0][0] = b;
        d[0][1] = c;
        for(int i = 0; i<a.size()/2; i++){
            b.add(a.get(i));
            c.add(a.get(i+a.size()/2));
        }
        return d;
    }
    
}
