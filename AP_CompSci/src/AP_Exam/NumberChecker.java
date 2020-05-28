package AP_Exam;

import java.util.Random;

public class NumberChecker{

    //a)

    public static int countNumbers (int n, int max){
    
        int countCalls = 0;

        for(int i = 0; i < n; i++){
            while (true){
                int r = getNumber();
                countCalls++;
                if(countCalls > max){
                    return -1;
                }

                if (r %3 == 0 && isTarget(r)){
                    break;
                }

                
            }
        }

        return countCalls;

    }



}