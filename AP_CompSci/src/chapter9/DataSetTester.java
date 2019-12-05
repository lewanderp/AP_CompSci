package chapter9;

import resources.Die;

/**
   This program tests the DataSet class.
*/
public class DataSetTester
{
   public static void main(String[] args)
   {
      DataSet bankData = new DataSet();

      bankData.add(new BankAccount(0));
      bankData.add(new BankAccount(10000));
      bankData.add(new BankAccount(2000));

      System.out.println("Average balance: " 
            + bankData.getAverage());
      // System.out.println("Expected: 4000");
      Measurable max = bankData.getMaximum();
      System.out.println("Highest balance: " 
         + max.getMeasure());
      // System.out.println("Expected: 10000");
      System.out.println("Lowest balance: " + bankData.getMinimum());
      
      
      DataSet coinData = new DataSet();

      coinData.add(new Coin(0.25, "quarter"));
      coinData.add(new Coin(0.1, "dime"));
      coinData.add(new Coin(0.05, "nickel"));

      System.out.println("Average coin value: " 
            + coinData.getAverage());
      // System.out.println("Expected: 0.133");            
      max = coinData.getMaximum();
      System.out.println("Highest coin value: " 
            + max.getMeasure());
      // System.out.println("Expected: 0.25");  
      System.out.println("Lowest coin value: " + coinData.getMinimum());
      
      // Vegetable DataSet
      DataSet vegetableData = new DataSet();
      
      vegetableData.add(new Vegetable("Root", 10));
      vegetableData.add(new Vegetable("Leaf", 4));
      vegetableData.add(new Vegetable("Stem", 8));
      
      System.out.println("Average vegetable weight: " + vegetableData.getAverage());
      System.out.println("Highest vegetable weight: " + vegetableData.getMaximum());
      System.out.println("Lowest vegetable weight: " + vegetableData.getMinimum());
      
      //Die Data Set
      
      DataSet dieData = new DataSet();
      
      dieData.add(new Die(20));
      dieData.add(new Die(20));
      dieData.add(new Die(20));
      
      System.out.println("Average die value: " + dieData.getAverage());
      System.out.println("Highest die value: " + dieData.getMaximum());
      System.out.println("Lowest die value: " + dieData.getMinimum());
      
      //Person Data set
      
      DataSet personData = new DataSet();
      
      personData.add(new Person("John", 70));
      personData.add(new Person("Suzy", 53));
      personData.add(new Person("HUMAN", 67));
      
      System.out.println("Average human height: " + personData.getAverage());
      System.out.println("Highest human height: " + personData.getMaximum());
      System.out.println("Lowest human height: " + personData.getMinimum());
   }
}
