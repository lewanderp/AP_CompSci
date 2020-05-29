package dataStructures;

public class ListNode {
    
    private Magazine value;
    private ListNode next;
    private ListNode previous;

    public ListNode(Magazine initValue, ListNode initNext, ListNode initPrevious){
        value = initValue;
        next = initNext;
        previous = initPrevious;
    }

    public Magazine getValue (){
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode getPrevious(){
        return previous;
    }

    public void setValue(Magazine theNewValue){
        value = theNewValue;
    }

    public void setNext(ListNode theNewNext){
        next = theNewNext;
    }

    public void setPrevious(ListNode theNewPrevious){
        previous = theNewPrevious;
    }

}