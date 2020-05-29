package dataStructures;

// single Magazine object
public class Magazine
{
    private String title;
    
    public Magazine (String newTitle)   // assign title to new magazine
    {  title = newTitle;}
    
    public String toString()            // return magazine as a String
    {  return " | " + title + " | ";   }  
}