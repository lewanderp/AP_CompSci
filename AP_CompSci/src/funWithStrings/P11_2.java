package funWithStrings;

import java.util.*;

public class P11_2{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter File Names: ");
        //C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\Shakeaspere.txt
        //C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\Shakeaspere2.txt
        //C:\\Users\\swedi\\Documents\\GitHub\\AP_CompSci\\AP_CompSci\\src\\funWithStrings\\Shakeaspere3.txt
        while(!PrintFileInfo.hasBeenReturned()){
            String fn = in.next();
            PrintFileInfo pfi = new PrintFileInfo(fn);
            System.out.println(pfi.printFileInfoInit());
        }
        in.close();
    }
}