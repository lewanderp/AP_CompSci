package intro_to_classes;

import resources.FishClass;

public class FishTester {
	public static void main (String [] args) {
		FishClass mFish = new FishClass();
		FishClass pFish = new FishClass();
		FishClass gFish = new FishClass();
		FishClass tFish = new FishClass(30, "Sir Fredrick Stewart IV");
		
		System.out.println("mFish: " + mFish.getWeight());
		mFish.eatMinnow();
		mFish.eatWorms(3);
		System.out.println("mFish: " + mFish.getWeight());
		
		System.out.println("pFish: " + pFish.getWeight());
		pFish.eatPlanton();
		System.out.println("pFish: " + pFish.getWeight());
		
		System.out.println("gFish (Weight): " + gFish.getWeight());
		System.out.println("gFish (Scales): " + gFish.getNumScales());
		gFish.setScales(36);
		gFish.eatMinnow();
		gFish.eatPlanton();
		gFish.eatWorms(4);
		System.out.println("gFish (Weight): " + gFish.getWeight());
		System.out.println("gFish (Scales): " + gFish.getNumScales());
		gFish.sharkBite();
		System.out.println("gFish (Weight): " + gFish.getWeight());
		System.out.println("gFish (Scales): " + gFish.getNumScales());
		
		System.out.println("tFish's name is: " + tFish.getName());
		System.out.println("tFish (Weight): " + tFish.getWeight());
		System.out.println("tFish (Scales): " + tFish.getNumScales());
		tFish.setScales(36);
		tFish.eatMinnow();
		tFish.eatPlanton();
		tFish.eatWorms(4);
		System.out.println("tFish (Weight): " + tFish.getWeight());
		System.out.println("tFish (Scales): " + tFish.getNumScales());
		tFish.sharkBite();
		System.out.println("tFish (Weight): " + tFish.getWeight());
		System.out.println("tFish (Scales): " + tFish.getNumScales());
	}
}
