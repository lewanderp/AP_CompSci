package arrays_and_array_lists;

import resources.FishClass;
import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {
	public static void main (String [] args) {
		ArrayList<FishClass> fsh = new ArrayList<FishClass>();
		Random r = new Random();
		//creating entries
		FishClass f1 = new FishClass();
		FishClass f2 = new FishClass(22);
		FishClass f3 = new FishClass(33, "Fish3");
		fsh.add(f1);
		fsh.add(f2);
		fsh.add(f3);
		//Random changes to each entry
		fsh.add(fsh.get(r.nextInt(3)));
		for(int i = 0; i < fsh.size();i++) {
			fsh.get(i).eatMinnow();
			fsh.get(i).eatPlanton();
			fsh.get(i).eatWorms(i);
		}
		fsh.remove(fsh.get(r.nextInt(3)));
		fsh.set(r.nextInt(fsh.size()), fsh.get(r.nextInt(3)));
		//Printing it all
		for (int i = 0 ; i<fsh.size(); i++) {
			System.out.println("Fish " + i);
			System.out.println("Weight: " + fsh.get(i).getWeight());
			System.out.println("Name: " + fsh.get(i).getName());
			System.out.println("Scales: " + fsh.get(i).getNumScales());
		}
	}
}
