package chapter9;
/**
 * A Simple Interface Example
 */
 public class SpeakerTester
 {
    public static void main(String[]args)
  {   
      //Speaker is an object variable that can refer to objects of different types
      Speaker critter = new Dog ("Fido", 16 ); 
      critter.speak();        // type of object determines the proper 'speak' method to call
      
                              // must 'cast' interface to use other object methods
      System.out.println (  ((Dog)critter).getWeight() ); 
      System.out.println (  ((Dog)critter).getName() );
      System.out.println ( critter );
      
      
      Speaker thing = new Singer ("Rap", 28 );
      thing.speak();          // type of object determines the proper 'speak' method to call
      
      System.out.println (  ((Singer)thing).getAge() );
      System.out.println (  ((Singer)thing).getType() ); 
      
      Speaker veg = new Vegetable("Potato", 20);
      veg.speak();
      
      System.out.println(	((Vegetable)veg).getName());
      System.out.println(	((Vegetable)veg).getWeight());
      
   }
}