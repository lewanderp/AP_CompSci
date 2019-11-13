package arrays_and_array_lists;

public class Arrays4_2_Elctric_Boogaloo {
	public static void main (String [] args) {
		
		double a1[] = new double[4];
		double a2[] = new double[6];
		
		System.out.println("a1");
		for(int i = 0; i < 4; i++) {
			a1[i] = i/10.0;
			System.out.println(a1[i]);
		}
		System.out.println("a1");
		for(int i = 0; i < 4; i++) {
			a2[i] = i/10.0;
			System.out.println(a2[i]);
		}
		
		double str = a1[1];
		a1[1]=a1[2];
		a1[2] = str;
		
		double a3[] = {a1[0],a1[1],a1[2] ,a1[3], a2[0], a2[1], a2[2], a2[3], a2[4], a2[5]};
		
		System.out.println("a3");
		for (int i = 0 ; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
	}
}
