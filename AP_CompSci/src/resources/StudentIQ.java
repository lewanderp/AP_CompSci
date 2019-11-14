package resources;
/**
 * Write a description of class StudentIQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class StudentIQ
{
   private String name;
   private int IQ;
   
   public StudentIQ (String nam)
   {
       name = nam;
       Random intelligence = new Random();
       IQ = intelligence.nextInt(86) + 75;
   }
   public String getName ()
   {
       return name;
   }
   public int getIQ ()
   {
       return IQ;
   }
}

