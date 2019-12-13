package chapter10;

/**
 * Program implementing Abstract Class: Pet
 * Two subclasses: Snake and Cat which extend Pet
 */

public class PetStore 
{    
    public static void main(String[]args)
   { 
      Pet jake = new Snake ("Jakester", 27); 
      System.out.println(jake);
      jake.speak();     
      jake.move();
      System.out.println();
      
      Pet tiger = new Cat("Tigger", 4);
      System.out.println(tiger);
      tiger.speak();
      tiger.move();
      tiger.move();     
      System.out.println( ((Cat)tiger).getLives() );  // cast Pet to access Cat method
      System.out.println();
      
      if ( tiger.compareTo(jake) < 0 )      // compare 2 "Pets"
                    System.out.print ( tiger.getName() + " is before " + jake.getName() ); 
      else if ( tiger.compareTo(jake) > 0 )
                    System.out.print ( tiger.getName() + " is after " + jake.getName() );
      else  System.out.print ( tiger.getName() + " and " + jake.getName() + " are the same \n" );
      
      Cat liger = new Cat("Liger", 6);
      System.out.println(liger);
      liger.move();
      liger.speak();  
      System.out.println( liger.getLives() );       // no cast required 
   }  
}