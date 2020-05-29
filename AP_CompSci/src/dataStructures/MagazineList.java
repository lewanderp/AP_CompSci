package dataStructures;

import java.util.NoSuchElementException;

public class MagazineList {
    
    private ListNode list;
    private int count;

    public MagazineList(){
        list = null;
        count = 0;
    }

    public void add(Magazine mag, int index){
        ListNode temp = new ListNode (mag, null, null);
        ListNode current = list;

        for(int i = 1; i< index && current.getNext() != null; i++){
            current = current.getNext();
            temp.setNext(current.getNext());
            temp.setPrevious(current);
            current.setNext(temp);
            count++;
        }
    }

    public void add(Magazine mag){
        ListNode temp = new ListNode(mag, null, null);
        ListNode current = list;

        if(list == null){
            list = temp;
        } else {
            current = list;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(temp);
            temp.setPrevious(current);
        }
        count++;
    }

    public Magazine removeFirst(){
        if(list == null){
            throw new NoSuchElementException();
        }
        Magazine lostNode = list.getValue();
        list = list.getNext();
        count--;
        return lostNode;
    }

    public int size(){
        return count;
    }

    public String toString(){
        String result = " ";
        ListNode current = list;
        while (current != null){
            result += current.getValue().toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

    public void remove (int index){
        ListNode current = list;

        for(int i = 0; i< index; i++){
            current = current.getNext();
        }

        ListNode previous = current.getPrevious();
        ListNode next = null;
        if(current.getNext() != null){
            next = current.getNext();
        } else {
            removeLast();
            return;
        }

        previous.setNext(next);
        next.setPrevious(previous);
        
    }

    public void removeLast (){
        
        ListNode current = list;

        for(int i = 0; i< count; i++){
            if(current.getNext() == null){
                ListNode temp = current.getPrevious();
                temp.setNext(null);
                break;
            }
        }
        count--;
        
    }

    public void addFirst (Magazine mag){

        if(list == null){
            throw new NoSuchElementException();
        }
        ListNode current = list;
        ListNode newNode = new ListNode(mag, current, null); 
        list.setPrevious(newNode);
        count++;

    }

}