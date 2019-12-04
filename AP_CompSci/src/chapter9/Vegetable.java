package chapter9;

@SuppressWarnings("rawtypes")
public class Vegetable implements Comparable, Speaker {
	
	private double weight;
	private String name;
	
	public Vegetable(String vName, double w) {
		weight = w;
		name = vName;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Healthy " + name + ", " + weight + " ounces";
	}
	public Vegetable mash(Vegetable v) {
		return new Vegetable(this.getName().substring(0, 3) + v.getName().substring(v.getName().length()-4, v.getName().length()-1), this.getWeight() + v.getWeight());
	}
	public int compareTo(Object obj) {
		double otherNum = ((Vegetable)obj).getWeight();
		if (weight < otherNum) {
			return -1;
		} else if (weight > otherNum) {
			return 1;
		} else {
			return 0;
		}
	}
	public void speak() {
		System.out.println("kill the zombies!");
	}
}
