package chapter10;

import java.util.ArrayList;

public class CarLot {

    private Car2 [] carLot;
    private int numCars;

    public CarLot(int maxCars){
        carLot = new Car2 [maxCars]; 
    }

    public void addCar(Car2 c){
        if (numCars+1 > carLot.length) {
            throw new IllegalArgumentException("Max Cars Reached");
        } else {
            carLot[numCars] = c;
            numCars++;
        }
        return;
    }

    public String toString(){
        String toPrint = "";
        for (int i = 0; i < numCars; i++){
            toPrint += "\n| Index Num: " + i + " |\tMake: " + carLot[i].getMake() + "|\tYear: " + carLot[i].getYear() +
                "|\tMileage: " + carLot[i].getMileage() + "|\tCost: $" + carLot[i].getCost() + "|";
        }
        return toPrint;
    }

    private ArrayList<Car2> findMatchingCars(Car2 c){
        ArrayList <Car2>  matchingCars = new ArrayList<Car2>();
        for (int i = 0; i < numCars; i++){
            if (c.equals(carLot[i])){
                matchingCars.add(carLot[i]);
            }
        }
        return matchingCars;
    }

    public String printMatchingCars(Car2 c){
        CarLot cars = new CarLot(findMatchingCars(c).size()-1);
        for(int i = 0; i < findMatchingCars(c).size()-1; i++){
            cars.addCar(findMatchingCars(c).get(i));
        }
        return cars.toString();
    }

    public int getNumCars(){
        return numCars;
    }

    public Car2 getCar(int i){
        if (i > numCars){
            throw new IllegalArgumentException ("not corect car index");
        }
        return carLot[i];
    }
}