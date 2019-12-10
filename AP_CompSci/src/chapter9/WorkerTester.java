package chapter9;

public class WorkerTester {
	public static void main (String [] args) {
		
		HourlyWorker hw = new HourlyWorker(20.0, 50);
		SalariedWorker sw = new SalariedWorker(50.0);
		
		System.out.println(hw.toString());
		System.out.println(sw.toString());
	}
}
