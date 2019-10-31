package chapter5;

public class P5_10_Class {
	
	private String month;
	private int days;
	
	P5_10_Class(String inputMonth){
		month = inputMonth;
		calcDays();
	}
	private void calcDays() {
		switch (month) {
			case	"february":
					days = 28;
					break;
			case	"january":
			case	"march":
			case	"may":
			case	"july":
			case	"august":
			case	"october":
			case	"december":
					days = 31;
					break;
			case	"april":
			case	"june":
			case	"september":
			case	"november":
					days = 30;
					break;
		}
	}
	public int getDays() {
		return days;
	}
}
