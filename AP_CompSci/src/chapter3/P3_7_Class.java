package chapter3;

public class P3_7_Class {
	
	private double cost;
	private String name;
	
	P3_7_Class(){
		
	}
	P3_7_Class(double Cost, String Name){
		cost = Cost;
		name = Name;
	}
	public void reduceCost(double costReduction) {
		cost-=costReduction;
	}
	public double getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
}
