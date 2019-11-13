package arrays_and_array_lists;

import resources.FishClass;

public class Array6 {
	public static void main (String [] args) {
		
		FishClass[] f = new FishClass[3];
	
		for (int i = 0 ; i < 3; i++) {
			f[i] = new FishClass();
			f[i].setScales(i*10);
			f[i].setName(""+i+"");
		}
		for (int i = 0; i < 3; i ++) {
			System.out.println(i +" Weight:"+ f[i].getWeight());
			System.out.println(i +" NumScales:"+ f[i].getNumScales());
		}
		for (int i = 0; i < 2; i++) {
			f[i].eatMinnow();
			f[i].eatPlanton();
			f[i].eatWorms(i);
			f[i].sharkBite();
			System.out.println(i +" Name "+ f[i].getName());
			System.out.println(i +" Weight:"+ f[i].getWeight());
			System.out.println(i +" NumScales:"+ f[i].getNumScales());
		}
	}
}
