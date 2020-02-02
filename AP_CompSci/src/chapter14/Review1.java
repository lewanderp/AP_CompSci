package chapter14;

import java.util.Arrays;

public class Review1 {
    private static int [] a = {212, 568, 658, 468, 658, 100, 101, 203, 998, 459, 809};
    public static void main (String [] args){
        //prints original array
        System.out.println("Original Array: ");
        System.out.print("[");
        for(int i =0; i< a.length-1; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println("]");
        // prints values greater than average, ends if the current array slot is unnasigned
        System.out.println("Values greater than average: ");
        System.out.print("[");
        for(int i =0; i< gAverage().length-1; i++){
            if(gAverage()[i] == 0)break;
            System.out.print(gAverage()[i]+", ");
        }
        System.out.print("]");
        // prints Array a with max and min values swapped
        swapMaxMin(0);
        System.out.println("\nArray a with max and min swapped: ");
        System.out.print("[");
        for(int i =0; i< a.length-1; i++){
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
        // prints Array a with 2nd max and 2nd min values swapped
        swapMaxMin(1);
        System.out.println("\nArray a with 2nd max and 2nd min swapped: ");
        System.out.print("[");
        for(int i =0; i< a.length-1; i++){
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
        //prints Array a in2 halves
        System.out.println("\nArray a halved: ");
        System.out.println("First Half: ");
        for(int i =0; i< splitHalf1().length-1; i++){
            System.out.print(splitHalf1()[i]+", ");
        }
        System.out.println("Secound Half: ");
        for(int i =0; i< splitHalf2().length-1; i++){
            System.out.print(splitHalf2()[i]+", ");
        }
    }
    //finds all values greater than tha average
    public static int[] gAverage(){
        int [] b = new int [a.length];
        int count =0;
        for(int i =0; i< a.length-1; i++){
            if(a[i] > getAverage()){
                b[count] = a[i];
                count++;
            }
        }
        return b;
    }
    // swaps min and max of array a
    //intakes int x wich determines which pair of values is swapped
    //the value of x is equal to the index of the first value in the pair and length-(x+1) == the index of the secound value
    public static void swapMaxMin(int x){
        int min = -1;
        int max = -1;
        int [] b = genSortedArray();
        for(int i =0; i< a.length; i++){
            if (a[i] == b[x]){
                min = i;
            }
            if (a[i] == b[b.length-x-1]){
                max = i;
            }
        }
        int str = a[min];
        a[min] = a[max];
        a[max] = str;
    }
    public static int [] splitHalf1(){
        int [] b = new int [a.length/2];
        for(int i = 0; i< b.length-1; i++){
            b[i] = a[i];
        }
        return b;
    }
    public static int [] splitHalf2(){
        int [] b = new int [a.length/2];
        for(int i =0; i< b.length-1; i++){
            b[i] = a[i+b.length];
        }
        return b;
    }
    //calculates the average and returns it
    private static double getAverage(){
        int sum = 0;
        int length = a.length;
        for (int i = 0; i < a.length-1; i++){
            sum+=a[i];
        }
        return sum/length;
    }
    //returs and array == to Array a sorted
    private static int [] genSortedArray(){
        int [] b = a.clone();
        Arrays.sort(b);
        return b;
    }
    //private static void swap(int )

}