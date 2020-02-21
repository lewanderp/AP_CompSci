package chapter14;

import java.util.*;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] numbers = {2,2,7,1,9,5,5,10,1,6,2,6,3,3,1,9,6};
        for (int i: numbers) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] duplicateFreeByFrequency = frequencyDuplicates(numbers);
        for (int i: duplicateFreeByFrequency) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] duplicateFreeByAdjacent = sortedDuplicates(numbers);
        for(int i: duplicateFreeByAdjacent){
            System.out.print(i + ", ");
        }

    }

    public static int[] frequencyDuplicates(int[] a){
        ArrayList<Integer> values = new ArrayList<>();
        for(int i: a){
            int index = -1;
            for(int j = 0; j<values.size() && index == -1; j++){
                if( values.get(j) == i) index = j;
            }
            if(index == -1){
                values.add(i);
            }
        }
        a = new int[values.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = values.get(i);
        }
        return a;
    }

    public static int[] sortedDuplicates(int[] a){
        Arrays.sort(a);
        int numberOfSolos =a.length;
        for(int i = 1; i<a.length; i++){
            if(a[i]==a[i-1]){
                a[i-1]=-1;
                numberOfSolos--;
            }
        }
        int[] nonDuplicates = new int[numberOfSolos];
        int index = 0;
        for(int i: a){
            if(i!=-1) {
                nonDuplicates[index] = i;
                index++;
            }
        }
        return nonDuplicates;
    }
}