package chapter14;

import java.util.Random;

public class RemovingDuplicates {
    public static int[][] AwithN;
    public static void main (String [] args){
        int [] arr = new int[50];
        aInit(arr);
        numOccurences(arr);
        System.out.println(printAwithN());

    }

    public static void aInit(int [] a){
        Random r = new Random();
        for(int i =0; i< a.length; i++){
            a[i] = r.nextInt(50)+1;
        }
    }

    public static void numOccurences(int [] a){
        AwithN = new int[a.length][2];
        for(int i =0; i< a.length; i++){
            AwithN[i][0] = a[i];
        }
        for(int i = 0; i<a.length;i++){
            for(int j =1+i;j<a.length ; j++){
                if(a[i] == a[j]){
                    AwithN[i][1]++;
                }

            }
        }
    }

    public static String printAwithN(){
        String toReturn = "[ ";
        for(int i =0; i<2; i++){
            toReturn = "[ ";
            for(int j = 0; i<AwithN.length;i++){
                toReturn+=AwithN[j][i]+", ";
            }
            toReturn+=" ]";
        }
        return toReturn;
    }
}