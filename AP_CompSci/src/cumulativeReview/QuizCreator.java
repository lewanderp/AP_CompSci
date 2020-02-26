package cumulativeReview;

import java.util.*;

public class QuizCreator{

    private int wrongCounter;
    private int points;
    private Random r;
    private Scanner in;

    public QuizCreator(){
        wrongCounter = 0;
        points = 0;
        r = new Random();
        in = new Scanner(System.in);
    }

    public boolean Quiz(){
        if(startQuiz() == true){
            System.out.println("Good job! You passed!");
            return true;
        }
        return false;
    }

    private boolean startQuiz(){
        System.out.println("Level 1");
        if(!lvl1()){
            System.out.println("You gotta start over!");
            wrongCounter = 0;
            return false;
        }
        wrongCounter = 0;
        System.out.println("Level 2");
        if(!lvl2()){
            System.out.println("You gotta start over!");
            wrongCounter = 0;
            return false;
        }
        wrongCounter = 0;
        System.out.println("Level 3");
        if(!lvl3()){
            System.out.println("You gotta start over!");
            wrongCounter = 0;
            return false;
        }
        wrongCounter = 0;
        System.out.println("Level 4");
        if(!lvl4()){
            System.out.println("You gotta start over!");
            wrongCounter = 0;
            return false;
        }
        wrongCounter = 0;
        return true;
    }

    private boolean lvl1(){
        boolean correct = false;
        for(int i = 0; i<5; i++){
            int a = r.nextInt(10);
            int b = r.nextInt(10);
            System.out.println("Points: " + points);
            System.out.println("What is "+ a +"+"+ b + "?");
            for(int j = 0; j<2; j++){
                int answer = in.nextInt();
                if(a+b==answer){
                    correct = true;
                    wrongCounter = 0;
                    points++;
                    break;
                } else {
                    System.out.println("That isn't right!");
                    wrongCounter++;
                }
                if(wrongCounter >= 2){return false;}
            }
            
        }
        return correct;
    }

    private boolean lvl2(){
        boolean correct = false;
        for(int i = 0; i<5; i++){
            int a = r.nextInt(10);
            int b = r.nextInt(10);
            System.out.println("Points: " + points);
            System.out.println("What is "+ a +"-"+ b + "?");
            for(int j = 0; j<2; j++){
                int answer = in.nextInt();
                if(a-b==answer){
                    correct = true;
                    wrongCounter = 0;
                    points++;
                    break;
                } else {
                    System.out.println("That isn't right!");
                    wrongCounter++;
                }
                if(wrongCounter >= 2){return false;}
            }
            
        }
        return correct;
    }

    private boolean lvl3(){
        boolean bool = r.nextBoolean();
        if(bool){
            return lvl3Mult();
        } else {
            return lvl3Div();
        }
    }

    private boolean lvl3Mult(){
        boolean correct = false;
        for(int i = 0; i<5; i++){
            int a = r.nextInt(10);
            int b = r.nextInt(10);
            System.out.println("Points: " + points);
            System.out.println("What is "+ a +"*"+ b + "?");
            for(int j = 0; j<2; j++){
                int answer = in.nextInt();
                if(a*b==answer){
                    correct = true;
                    wrongCounter = 0;
                    points++;
                    break;
                } else {
                    System.out.println("That isn't right!");
                    wrongCounter++;
                }
                if(wrongCounter >= 2){return false;}
            }
            
        }
        return correct;
    }

    private boolean lvl3Div(){ 
        boolean correct = false;
        for(int i = 0; i<5; i++){
            int a = r.nextInt(10);
            int b = r.nextInt(10);
            while(!isFactor(a, b)){
                b = r.nextInt(10);
            }
            System.out.println("Points: " + points);
            System.out.println("What is "+ a +"/"+ b + "?");
            for(int j = 0; j<2; j++){
                int answer = in.nextInt();
                if(a/b==answer){
                    correct = true;
                    wrongCounter = 0;
                    points++;
                    break;
                } else {
                    System.out.println("That isn't right!");
                    wrongCounter++;
                }
                if(wrongCounter >= 2){return false;}
            }
            
        }
        return correct;
    }

    public boolean lvl4(){
        int rand = r.nextInt(4);
        switch (rand){
            case 0:
                return lvl1();
            case 1:
                return lvl2();
            case 2:
                return lvl3();
            case 3:
                return lvl4();
        }
        return false;
    }

    private static boolean isFactor(int number, int div) {
        if (number % div == 0) {
            return true;
        }
	    return false;
	}
}