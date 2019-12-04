package chapter9;


public  class Dog implements Speaker 
{
    private int weight;
    private String name;
    private static int numberDogs = 0; 
         
    public Dog (String dogName, int w)  
        {  weight = w;
            name = dogName;
            numberDogs++;}
            
    public int getWeight () 
        {   return weight; }
          
    public String getName () 
        {   return name;   }
        
    public static int getdogs()
    {   return numberDogs;    }
        
    public void speak()
    {  System.out.println( " Ruff Ruff ");}

    
    public String toString()
    {
        return name + " weighs " + weight;
    }
}