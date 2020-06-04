package dataStructures;

import java.util.Scanner;
import java.util.Random;

public class Theatre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        System.out.println("How many lines are there?");
        int numLines = in.nextInt();
        System.out.println("How many people are in the lines to begin?");
        int startingPeople = in.nextInt();
        System.out.println("How many milliseconds would you like to run the simulation?");
        long millisToRun = in.nextLong();

        FrontDesk frontDesk = new FrontDesk(numLines, startingPeople);

        long startTime = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();

        long[][] timeToServeCustomer = new long[numLines][2];
        long[][] timeTillAnotherPerson = new long[1][2];

        for (int i = 0; i < numLines; i++) {
            timeToServeCustomer[i][0] = r.nextInt(5000) + 5000;
            timeToServeCustomer[i][1] = System.currentTimeMillis();
        }
        timeTillAnotherPerson[0][0] = r.nextInt(2500) + 2500;
        timeTillAnotherPerson[0][1] = System.currentTimeMillis();

        while (startTime + millisToRun > currentTime) {

            if (timeTillAnotherPerson[0][0] + timeTillAnotherPerson[0][1] <= currentTime) {
                System.out.println("New Customer: " + frontDesk.newPerson());
                timeTillAnotherPerson[0][0] = r.nextInt(2500) + 2500;
                timeTillAnotherPerson[0][1] = System.currentTimeMillis();

            }
            for (int i = 0; i < numLines; i++) {
                if (timeToServeCustomer[i][0] + timeToServeCustomer[i][1] <= currentTime) {
                    System.out.println(frontDesk.getLine(i).transactionComplete("L" + i));
                    timeToServeCustomer[i][0] = r.nextInt(5000) + 5000;
                    timeToServeCustomer[i][1] = System.currentTimeMillis();
                    if (!frontDesk.getLine(i).lineEmpty()) {
                        System.out.println("Customer Served by L" + i);
                    }
                }
            }

            currentTime = System.currentTimeMillis();
        }

        for (int i = 0; i < numLines; i++) {
            System.out.println(frontDesk.getLine(i).toString("L" + i));
        }

        currentTime = System.currentTimeMillis();
        System.out.println("***********************************************************************");
        System.out.println("Total People served and in a line:\t" + TicketLine.getTotalPeopleClass());
        System.out.println("Simulation Run Time:\t\t\t" + (currentTime - startTime));
        System.out.println("***********************************************************************");
        in.close();
    }
}