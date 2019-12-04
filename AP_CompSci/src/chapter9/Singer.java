package chapter9;

public class Singer implements Speaker
{
    private int age;
    private String musicType;
         
    public Singer (String mType, int a)  
        {   age = a;
            musicType = mType;  }
            
    public int getAge () 
        {   return age; }
          
    public String getType () 
        {   return musicType;   }
        
    public void speak()
    {  System.out.println( " My Country Tis' of thee.... ");
    }
}
