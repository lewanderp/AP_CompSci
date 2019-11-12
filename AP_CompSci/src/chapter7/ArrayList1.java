package chapter7;

import java.util.ArrayList;
import resources.StringStuff;

public class ArrayList1 {
	public static void main (String [] args) {
		
		ArrayList<String> things = new ArrayList<String>();
		StringStuff s = new StringStuff();
		
		things.add("Philip");
		things.add("are");
		things.add("Lewander");
		things.add("Banana");
		things.add("Bee");
		
		System.out.println("Original Array");
		for(int i = 0; i <things.size(); i++) {
			System.out.println(things.get(i));
		}
		System.out.println("Words less than 4 letters");
		for (int i = 0 ; i < things.size(); i++) {
			if (things.get(i).length() < 4) {
				System.out.println(things.get(i));
			}
		}
		System.out.println("All lower case letters are upper case");
		for (int i = 0; i < things.size(); i++) {
			if(!s.isUpperCase(0, things.get(i))){
				int ascii = things.get(i).charAt(0);
				char invers = (char) (ascii-=32);
				String subStr2 = things.get(i).substring(1);
				things.set(i, invers+subStr2);
			}
			System.out.println(things.get(i));
		}
		System.out.println("Removing largest and shortest String");
		 int highestIndex = -1;
		 int lowestIndex = -1;
		 int highest = 0;
		 int lowest = 100;
		 for (int i = 0; i<things.size(); i++) {
	            int length = things.get(i).length();
	            if(length>highest){
	                highestIndex = i;
	                highest = length;
	            }
	            if(length < lowest){
	                lowestIndex = i;
	                lowest = length;
	            }
	        }
		things.remove(lowestIndex);
		things.remove(highestIndex-1);
		for(int i = 0; i <things.size(); i++) {
			System.out.println(things.get(i));
		}
	}
}
