package chapter5;

public class P5_5_Class {
	
	private double numGrade;
	private String letGrade;
	
	P5_5_Class(String grade){
		letGrade = grade;
		calcNumGrade();
	}
	private void calcNumGrade() {
		int letVal = letGrade.charAt(0);
		switch (letVal) {
			case 65:
				numGrade = 4.0;
				break;
			case 66:
				numGrade = 3.0;
				break;
			case 67:
				numGrade = 2.0;
				break;
			case 68:
				numGrade = 1.0;
				break;
			case 70:
				numGrade = 0.0;
				break;
		}
		if	(letGrade.length() > 1) {
			if	(letGrade.charAt(1) == '+') {
				if( numGrade != 4	) {
					numGrade+=.3;
				}
			} else {
				numGrade-=0.3;
			}
		}
	}
	public double getNumGrade() {
		return numGrade;
	}
}
