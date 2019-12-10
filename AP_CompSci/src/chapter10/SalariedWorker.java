package chapter10;

public class SalariedWorker extends Worker{
	
	public SalariedWorker(double hourlyRate) {
		super (hourlyRate);
		computeWeeklyPay();
	}
	private void computeWeeklyPay() {
		super.setWeeklyPay(super.getHourlyRate()*40);
	}
	public String toString() {
		return "Salaried Worker's hourly pay is: " + this.getWeeklyPay();
	}
}
