package chapter14;

import java.util.Random;

public class BubbleSort{
    public static Random r = new Random();
    public static int [] a = new int [10];
    public static void main (String [] args){
        initA();
        bubbleSort();
        System.out.println(printA());
    }

    public static void initA(){
        for(int i =0; i< a.length; i++){
            a[i] = r.nextInt(50)+1;
        }
    }

    public static String printA(){
        String s = "";
        s+="[ ";
        for(int i =0; i< a.length-2; i++) {
            s+=a[i]+", ";
        }
        s+=a[a.length-1]+" ]";
        return s;
    }

    public static void bubbleSort(){

        boolean isSorted = false;

        for(int i =0; i< a.length; i++){
            isSorted = true;
            for (int j = 1; j< a.length; j++){
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}