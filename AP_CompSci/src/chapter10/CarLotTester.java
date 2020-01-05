package chapter10;

public class CarLotTester{
    public static void main (String [] args){
        CarLot carlot = new CarLot (5);
        carlot.addCar(new Car2("Toyota Camry", 2002, 19080, 01000));
        carlot.addCar(new Car2("Ford Focus  ", 2009, 50000, 10000));
        carlot.addCar(new Car2("Toyota Camry", 2002, 19000, 05000));
        carlot.addCar(new Car2("Toyota Camry", 2002, 19800, 15000));
        carlot.addCar(new Car2("Model T     ", 1958, 50010, 60));

        System.out.println(carlot);
        System.out.println(carlot.printMatchingCars(carlot.getCar(0)));
    }
}