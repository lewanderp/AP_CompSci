package chapter4;

public class P4_14_Class {
	
	private int startTime;
	private int endTime;
	private int hrDif;
	private int minDif;
	
	P4_14_Class(int time1, int time2){
		startTime = time1;
		endTime = time2;
		calcHrDif();
		calcMinDif();
	}
	public int getStartTime() {
		return startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public int getMinDif() {
		return minDif;
	}
	public int getHrDif() {
		return hrDif;
	}
	private boolean whichOneHr() {
		if (endTime/100 >= startTime/100) {
			return true;
		} else {
			return false;
		}
	}
	private boolean whichOneMin() {
		if (endTime%100 >= startTime%100) {
			return true;
		} else {
			return false;
		}
	}
	private void calcMinDif() {
		int sMin = startTime % 100;
		int eMin = endTime % 100;
		if (whichOneMin() == true) {
			minDif = eMin - sMin;
		} else {
			int strS = 60 - sMin;
			minDif = strS + eMin;
			hrDif--;
		}
	}
	private void calcHrDif() {
		int sHour = startTime / 100; 
		int eHour = endTime / 100;
		if (whichOneHr() == true) {
			hrDif = eHour - sHour;
		} else {
			int strH = 24 - sHour;
			hrDif = strH + eHour;
		}
	}
}
