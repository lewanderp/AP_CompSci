package arrays_and_array_lists;

import java.util.ArrayList;
import resources.StudentIQ;

public class ArrayList3 {
	public static void main (String [] args) {
		
		ArrayList<StudentIQ> classroom = new ArrayList<StudentIQ>();
	
		
		double sum = 0;
		for(int i = 0; i< 5; i++) {
			classroom.add(i, new StudentIQ(""+i+""));;
			System.out.println("Student Name: " + classroom.get(i).getName());
			System.out.println("Student IQ: " + classroom.get(i).getIQ());
			sum+= classroom.get(i).getIQ();
		}
		double avrg = sum/classroom.size();
		System.out.println("Average IQ: " + avrg );
		System.out.println("\nIQs over 120 with student name: ");
		for (int i = 0; i < 5; i++) {
			if(classroom.get(i).getIQ() > 120) {
				System.out.println("Student Name: " + classroom.get(i).getName());
				System.out.println("Student IQ: " + classroom.get(i).getIQ());
			}
		}
		System.out.println("\nRemoved even IQs");
		for(int i = 1; i< 6; i++) {
			if (classroom.get(i-1).getIQ()%2 == 0) {
				classroom.remove(i-1);
				i--;
			} else {
				System.out.println("Student Name: " + classroom.get(i).getName());
			System.out.println("Student IQ: " + classroom.get(i).getIQ());
			}
		}
	}
}
