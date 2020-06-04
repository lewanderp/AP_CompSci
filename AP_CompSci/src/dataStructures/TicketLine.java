package dataStructures;

import java.util.Stack;

public class TicketLine {

    // Number of people at the beggining of the program.
    private int startPeople;
    // Number of people currently in the line;
    private int people;
    // Total number of people who have been in the line
    private int totalPeople = 0;
    //total number of people in all lines
    private static int totalPeopleClass = 0;
    // The stack of people
    private Stack<Person> line;

    public TicketLine(int numPeople) {
        line = new Stack<Person>();
        startPeople = numPeople;
        people = numPeople;

        for (int i = 0; i < numPeople; i++) {
            // Creates new person and adds it to the line, C means customer, i is the
            // customer number
            Person p = new Person("C" + totalPeopleClass);
            line.push(p);
            totalPeople++;
            totalPeopleClass++;
        }

    }

    public static int getTotalPeopleClass(){
        return totalPeopleClass;
    }

    public void addStartingPerson(){
        startPeople++;
    }

    // Returns if line is empty
    public boolean lineEmpty() {
        return line.isEmpty();
    }

    // Returns number of people in line
    public int numPeople() {
        return people;
    }

    // Return the number of people who started in the line
    public int getStartPeople() {
        return startPeople;
    }

    // Returns total number of people who have been in the line
    public int getTotalPeople() {
        return totalPeople;
    }

    // Adds another person to the bottom of the stack
    public String newPerson() {
        totalPeople++;
        totalPeopleClass++;
        people++;
        Person p = new Person("C" + totalPeopleClass);
        line.push(p);
        return p.getName();
    }

    // removes person from top of stack
    public String transactionComplete(String lineID) {
        if (!lineEmpty()){
            Person p = line.pop();
            p.giveTicket();
            String toReturn = p.toString();
            people--;
            return toReturn;
        }
        return "Line Empty: " + lineID;
        
    }

    public String toString(String lineID) {
        String toReturn = "";
        toReturn += "_______________________________________________________________________";
        toReturn += "\n" + "Line ID:\t\t\t\t" + lineID;
        toReturn += "\n" + "Number of starting People:\t\t" + startPeople;
        toReturn += "\n" + "Number of people in line:\t\t" + people;
        toReturn += "\n" + "Total People that have been in line:\t" + totalPeople;
        toReturn += "\n" + "Num people served:\t\t\t" + (totalPeople - people);
        toReturn += "\n" + "_______________________________________________________________________";
        return toReturn;
    }
}
