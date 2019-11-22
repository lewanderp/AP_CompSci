package arrays_and_array_lists;

import java.util.Scanner;

public class Array5_2_Boogaloo {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String[] thing = new String[5];
		thing[0] = "aa";
		thing[1] = "bb";
		thing[2] = "cc";
		@SuppressWarnings("unused")
		boolean isFull = false;
		
		while(true) {
			System.out.println("Enter Search Term: ");
			String searchWord = in.next();
			int index = -1;
			boolean isFound = false;
			
			for (int i = 0; i < thing.length; i++) {
				if (thing[i] == null) {
					break;
				}
				if (thing[i].contentEquals(searchWord)) {
					isFound = true;
					index = i;
				}
			}
			if (isFound == true) {
				System.out.println("index: " + index);
			} else {
				for (int j = 0; j < thing.length; j++) {
					if (thing[j] == null) {
						thing[j] = searchWord;
						System.out.println("Added search term");
					} else {
						if (thing[thing.length-1] != null) {
							isFull = true;
							String[] stor = thing;
							thing = new String[stor.length-1];
							for(int i = 0; i<thing.length; i++) {
								thing[i] = stor[i];
							}
							thing[thing.length-1] = searchWord;
						System.out.println("Added search term and length");
						}
					}
				}
			}
			System.out.println("Do you want to search again (y/n)?\n");
			if (in.next().contentEquals("n")) {
				break;
			}
		}
	}
}
