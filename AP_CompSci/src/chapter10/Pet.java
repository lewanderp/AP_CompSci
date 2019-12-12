package chapter10;

/**
 * Abstract class Pet - 
 * Represents a pet.....cannot be instantiated
 */
@SuppressWarnings("rawtypes")
public abstract class Pet implements Comparable     // Pet is 'template' for what methods
{                                                     //   any subclasses MUST define
    
    private String petName;
    
    public abstract void speak();   // subclass must contain a 'speak'
    public abstract void move();    // subclass must contain a 'move'
    
    public Pet(String nameOfit)
    {  petName = nameOfit; }

    public String getName()
    { return petName;}
    
    public int compareTo (Object obj)      
    {
        String otherName = ( ((Pet)obj).getName() );    
        if ( petName.compareTo(otherName) < 0)
            return -1;
        else if ( petName.compareTo(otherName) > 0 )
            return 1;
        else
            return 0;
    }   
    
    
}
