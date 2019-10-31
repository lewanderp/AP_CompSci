package chapter3;
//Student Class
import java.util.ArrayList;

public class P3_6_Class {
	
	private String name;
	private ArrayList <Double> quizScores = new ArrayList <Double>	();
	
	P3_6_Class(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
	public void addQuizScore(double score) {
		quizScores.add(score);
	}
	public double getAverageScore() {
		double average = getTotal()/(quizScores.size());
		return average;
	}
	public double getTotal() {
		double sum = 0;
		for(int i=0;i<quizScores.size();i++) {
			sum+=quizScores.get(i);
		}
		return sum;
	}
	
}
