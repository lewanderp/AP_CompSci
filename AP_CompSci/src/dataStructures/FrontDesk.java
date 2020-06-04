package dataStructures;

public class FrontDesk {

    TicketLine[] frontDesk;

    public FrontDesk(int numLines, int numPeopleStart) {
        frontDesk = new TicketLine[numLines];
        assignStartPeopleToLine(numPeopleStart, numLines);
    }

    private void assignStartPeopleToLine(int numPeople, int numLines) {
        if (numPeople % numLines != 0) {
            int numToDistribute = 0;
            for (int i = 0; i < numPeople; i++) {
                numToDistribute++;
                numPeople--;
                if (numPeople % numLines == 0) {
                    for (int j = 0; j < numLines; j++) {
                        frontDesk[j] = new TicketLine(numPeople / numLines);
                    }
                    for (int j = 0; j < numToDistribute; j++) {
                        frontDesk[j].newPerson();
                        frontDesk[j].addStartingPerson();
                    }
                    break;
                }
            }
        } else {
            for (int i = 0; i < numLines; i++) {
                frontDesk[i] = new TicketLine(numPeople / numLines);
            }
        }
    }

    public String newPerson() {
        int shortestIndex = 0;
        for (int i = 1; i < frontDesk.length; i++) {
            if (frontDesk[i].numPeople() < frontDesk[i - 1].numPeople()) {
                shortestIndex = i;
            }
        }
        return frontDesk[shortestIndex].newPerson();
    }

    public TicketLine getLine(int lineNum) {
        return frontDesk[lineNum];
    }

}