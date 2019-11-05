package chapter7;

import java.util.Scanner;

public class Array7 {
	
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a percentage");
        
        double input = in.nextDouble();
        //first method: 2 parrallel arrays
        int[]cutoff = {93,90,87,83,80,77,73,70,67,63,60};
        String[]grade = {"A", "A-","B+","B","B-","C+","C","C-","D+","D","D-"};
        boolean done = false;
        int i;
        for (i = 0; i < cutoff.length && !done; i++) {
            if(cutoff[i]<=input) {
            	done=true;
            }
        }
        if(done) {
            System.out.println(grade[i-1]);
        } else {
        	System.out.println("F");
        }
            

        //second method: one 2x11 array
        String [][] gradesWithCuttoff = new String[2][11];
        for (i = 0;  i< cutoff.length; i++) {
            gradesWithCuttoff[0][i] = grade[i];
            gradesWithCuttoff[1][i] = String.valueOf(cutoff[i]);
        }
        done = false;
        for (i = 0; i < cutoff.length && !done; i++) {
            if(Integer.parseInt(gradesWithCuttoff[1][i])<=input)
                done=true;
        }
        if(done) {
        	System.out.println(gradesWithCuttoff[0][i-1]);
        } else {
        	System.out.println("F");
        }   
    }
}
