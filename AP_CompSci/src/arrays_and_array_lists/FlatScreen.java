package arrays_and_array_lists;

/**
 *  Class "FlatScreen".
 *  Develop toString and equals methods for class.
 */
public class FlatScreen
{
    private int diagonal;   // 'instance' fields 
    private String brand;  
         
    public FlatScreen()      // default Constructor 
        {   diagonal = 34 ;
            brand = "generic";} 
              
    public FlatScreen (int d, String name)   // Directly assigns instance variables
        {   diagonal = d;
            brand = name; }
            
    public void upgrade(int i)   // 'Mutator" or Modifier method 
        {   diagonal += i;  }
        
    public int getDiagonal ()    // "Accessor" method 
        {   return diagonal;  }  
        
    public String getName ()
        {   return brand;  }
        
    public String toString()     // display of FlatScreen object
        {   return  brand + " diagonal = " + diagonal;     }
    
    public boolean equals (Object s)    // FlatScreen "equality" defined
    {   
        FlatScreen set= (FlatScreen) s;  // cast Object to Class type
        boolean checkdiags = false;
        if (this.getDiagonal()==set.getDiagonal() 
                                    && this.getName().equals(set.getName()) )
             checkdiags = true;
        return checkdiags;  }
      
    
  // public boolean equals ( Object s)   // direct way without local boolean variable
  // {  FlatScreen set = (FlatScreen) s;
  //    return (( this.getDiagonal() == set.getDiagonal() ) 
  //                                   && this.getName().equals(set.getName() ));
  // }  
      
}
