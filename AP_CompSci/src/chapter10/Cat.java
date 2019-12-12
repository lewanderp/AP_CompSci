package chapter10;

/**
 * Subclass of Abstract Class: Pet
 * Must define all methods defined in Pet
 */

public class Cat extends Pet
{   
     private int age;
     private String name;
     private int lives;
     
    public Cat(String catName, int catAge)  
    {  
        super(catName);   
        age = catAge;
        name = catName;
        lives = 9;
    }
    
    public void speak()                 // must implement (abstract in Pet)
    {  System.out.println( "Meow" );  }
    
    public void move()                  // must implement
    {   lives--;
        System.out.println( "pouncing");  }
    
    public String getName()             // must implement
    {  return name;   }
    
    public String getLives()        // additional method specific to Cat
    {  return lives + " lives \n"; }
    
    public String toString()
    {  return name + " is a cat " + age + " years old";}
}