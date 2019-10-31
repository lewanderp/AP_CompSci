package Refreshers;

public class P1_6 {
	public static void main (String [] args) {
		//no loops
		System.out.println((1/1)+(1.0/2)+(1.0/3)+(1.0/4)+(1.0/5)+(1.0/6)+(1.0/7)+(1.0/8)+(1.0/9)+(1.0/10));
		System.out.println(1.0+2.0+3.0+4.0+5.0+6.0+7.0+8.0+9.0+10.0);
		//loops
		double sum = 0;
		double sum2 = 0;
		for(int i = 0; i<10;i++) {
			sum+=(1/(i+1.0));
		}
		for(double i=0.0;i<10;i++) {
			sum2+=(i+1.0);
		}
		System.out.println(sum + "  " + sum2);
	}
}
