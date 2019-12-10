package chapter9;

public class Worker {
	
	private double hourlyRate;
	private double weeklyPay;
	
	public Worker(double hourlyRate2) {
		setHourlyRate(hourlyRate2);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate2) {
		this.hourlyRate = hourlyRate2;
	}

	public double getWeeklyPay() {
		return weeklyPay;
	}

	public void setWeeklyPay(double d) {
		this.weeklyPay = d;
	}
}
