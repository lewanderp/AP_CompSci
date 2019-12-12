package chapter10;

/**
 * Subclass of Abstract Class: Pet
 * Must define all methods defined in Pet
 */

public class Snake extends Pet
{
     private int length;
     private String name;
     
    public Snake(String snakeName, int snakelength)
    {  
        super(snakeName);
        length = snakelength;
        name = snakeName;
    }
    
    public void speak()                   // must implement (abstract in Pet)
    {  System.out.println( "Hissss" );  }
    
    public void move()                   // must implement
    {  System.out.println( "slither");  }
    
    public String getName()             // must implement
    {  return name;   }
    
    public String toString()
    {  return name + " is a snake " + length + " inches long";}
}