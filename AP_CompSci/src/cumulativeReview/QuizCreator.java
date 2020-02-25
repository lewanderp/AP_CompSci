package cumulativeReview;

import java.util.*;

public class QuizCreator{

    private int wrongCounter;
    private Random r;
    private Scanner in;

    public QuizCreator(){
        wrongCounter = 1;
        r = new Random();
        in = new Scanner(System.in);
    }

    public void Quiz(){
        while (true){
            if(startQuiz() == true){
                System.out.println("Good job! You passed!");
                return;
            }
        }
    }

    private boolean startQuiz(){
        System.out.println("Level 1");
        if(!lvl1()){
            System.out.println("You gotta start over!");
            return false;
        }
        wrongCounter = 0;
        System.out.println("Level 2");
        if(!lvl2()){
            System.out.println("You gotta start over!");
            return false;
        }
        wrongCounter = 0;
        System.out.println("Level 3");
        if(!lvl3()){
            System.out.println("You gotta start over!");
            return false;
        }
        wrongCounter = 0;
        System.out.println("Level 4");
        if(!lvl4()){
            System.out.println("You gotta start over!");
            return false;
        }
        wrongCounter = 0;
        return true;
    }

    private boolean lvl1(){
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        boolean correct = false;
        System.out.println("What is: " + a + "+" + b);
        while (wrongCounter < 2 && !correct){
            int answer = in.nextInt();
            if (answer != a+b){
                wrongCounter++;
                System.out.println("Thats Not Right!");
            } else {
                correct = true;
            }
        }
        return correct;
    }

    private boolean lvl2(){
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        boolean correct = false;
        System.out.println("What is: " + a + "-" + b);
        while (wrongCounter < 2 && !correct){
            int answer = in.nextInt();
            if (answer != a-b){
                wrongCounter++;
                System.out.println("Thats Not Right!");
            } else {
                correct = true;
            }
        }
        return correct;
    }

    private boolean lvl3(){
        if(lvl3Mult() == false){
            return false;
        }
        if(lvl3Div() == false){
            return false;
        }
        return true;
    }

    private boolean lvl3Mult(){
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        boolean correct = false;
        System.out.println("What is: " + a + "*" + b);
        while (wrongCounter < 2 && !correct){
            int answer = in.nextInt();
            if (answer != a*b){
                wrongCounter++;
                System.out.println("Thats Not Right!");
            } else {
                correct = true;
            }
        }
        return correct;
    }

    private boolean lvl3Div(){
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        boolean correct = false;
        System.out.println("What is: " + a + "/" + b);
        while (wrongCounter < 2 && !correct){
            int answer = in.nextInt();
            if (answer != a/b){
                wrongCounter++;
                System.out.println("Thats Not Right!");
            } else {
                correct = true;
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
}