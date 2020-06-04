package dataStructures;

public class Person {
	
    private String name;
    private boolean hasTicket;
    
    public Person(String Name) {
        name = Name;
        hasTicket = false;
    }
    public String getName() {
        return name;
    }

    public void giveTicket(){
        hasTicket = true;
    }

    public boolean hasTicket(){
        return hasTicket;
    }

    public String toString() {
        String toReturn = name;
        if(hasTicket()){
            toReturn += " has their ticket.";
        } else {
            toReturn += " does not have their ticket";
        }
        return toReturn;
    }
    
}