package chapter14;

import java.util.Arrays;

public class CommercialSort{

    public static Commercial a []= new Commercial[5];

    public static void main(String [] args){

    }
    public static void initA(){
        for(int i = 0; i<a.length-1; i++){
            a[i] = new Commercial("Product: " + i);
        }
    }
    

}