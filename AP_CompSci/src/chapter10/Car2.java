package chapter10;

public class Car2{

    private String make;
    private int year;
    private int mileage;
    private double cost;

    public Car2(String Make, int Year, int Mileage, double Cost){
        make = Make;
        year = Year;
        mileage = Mileage;
        cost = Cost;
    }
    public void addMileage(int m){
        mileage+=m;
    }
    public boolean equals(Car2 c){
        if (this.getMake().equals(c.getMake()) && this.getYear() == c.getYear()){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Make:\t" + make + ", Year:\t" + year + ", Mileage:\t" + mileage + ", Cost:\t" + cost;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return year;
    }
    public int getMileage(){
        return mileage;
    }
    public double getCost(){
        return cost;
    }
}