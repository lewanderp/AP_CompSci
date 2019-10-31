package chapter3;

public class P3_11_Class {
	
	private int roachPop;
	
	P3_11_Class(){
		roachPop = 100;
	}
	P3_11_Class(int initRoachPop){
		roachPop = initRoachPop;
	}
	public void breed() {
		roachPop*=2;
	}
	public void spray() {
		double dead = roachPop*.10;
		if (dead < 0) {
			roachPop-=1;
		} else {
			roachPop-=dead;
		}
	}
	public int getPop() {
		return roachPop;
	}
}
