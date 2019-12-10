package chapter10;

public class HourlyWorker extends Worker {
	
	private int hoursWorked;
	
	public HourlyWorker(double hourlyRate, int hrsWorked) {
		super (hourlyRate);
		setHoursWorked(hrsWorked);
		computeWeeklyPay();
	}
	private void computeWeeklyPay() {
		int regularTime = 0;
		int overTime = 0;
		if(this.getHoursWorked() >= 40) {
			regularTime = 40;
			overTime = this.getHoursWorked()-40;
		} else {
			regularTime = this.getHoursWorked();
		}
		this.setWeeklyPay(regularTime*this.getHourlyRate() + overTime*this.getHourlyRate()*1.5);
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public String toString() {
		return "Hourly Worker's hourly pay is: " + this.getWeeklyPay();
	}
}
