package chapter3;

public class P3_9_Class {
	
	public String line [] = new String [11]; 
	public int loc;
	private boolean direction;
	
	P3_9_Class (){
		direction=true;
		lineAssign();
		loc=5;
	}
	private void lineAssign() {
		for(int i=0;i<11;i++) {
			line[i]="_";
		}
		line[5]=">";
	}
	public void move() {
		line[loc]="_";
		if (direction == true) {
			loc+=1;
		}else if (direction == false){
			loc-=1;
		} else {
			System.out.println("big wrong!!!");
			return;
		}
		if (direction == true) {
			line[loc]=">";
		} else {
			line[loc]="<";
		}
	}
	public void turn() {
		if (direction == true) {
			direction = false;
			line[loc]="<";
		} else {
			direction = true;
			line[loc]=">";
		}
	}
	public int getLoc() {
		return loc;
	}
	public String getDirection() {
		if (direction == true) {
			return "right";
		} else if (direction == false) {
			return "left";
		}
		return "error";
	}
	public String getArray() {
		String array = "[";
		for (int i=0;i<11;i++) {
			array = array.concat(line[i]);
		}
		array = array.concat("]");
		return array;
	}
	
	
}
