package arrays_and_array_lists;
/**
 * Philip's part of the program
 */
import java.util.Random;

public class FlatScreenTester {
	
	public static void main (String[] args) {
		FlatScreen[] screens = new FlatScreen[5];
		Random r = new Random();
		
		System.out.println("Unaltered Objects");
		for(int i = 0; i < 5; i++) {
			screens[i] = new FlatScreen( r.nextInt(50) + 10, ""+i+"");
			System.out.println(screens[i].toString());
		}
		
		int smallestIndex = 0;
		for(int i = 1; i< 5; i++) {
			if (screens[i].getDiagonal() < screens[smallestIndex].getDiagonal()) {
				smallestIndex = i;
			}
		}
		int largestIndex = 0;
		for(int i = 1; i< 5; i++) {
			if (screens[i].getDiagonal() > screens[largestIndex].getDiagonal()) {
				largestIndex = i;
			}
		}
		FlatScreen store = screens[smallestIndex];
		screens[smallestIndex] = screens[largestIndex];
		screens[largestIndex] = store;
		System.out.println("Swapped largest and smallest Objects");
		for(int i = 0; i < 5; i++) { 
			System.out.println(screens[i].toString());
		}
		
		
	}
}
