package arrays_and_array_lists;

import java.util.Random;

public class Array3 {
	public static void main (String [] args) {
		
		Random r = new Random();
		int x[] = new int[25]; // the numbers
		int groups[] = new int [5]; //the 5  different groups that the numbers are being sorted by
		
		for (int i = 0; i < x.length; i++) { // gens and adds to groups
            x[i]=r.nextInt(50)+1;
            if(x[i] < 11){
                groups[0]++;
            } else if (x[i] <21){
                groups[1]++;
            } else if (x[i] < 31){
                groups[2]++;
            } else if (x[i] < 41){
                groups[3]++;
            } else {
                groups[4]++;
            }
        }
		System.out.println();
		for (int i = 0; i < groups.length; i++) { // prints count for each group
			System.out.println(((i+1)*10)-9 + "-" + ((i+1)*10) + ":");
			for (int j = 0; j < groups[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
