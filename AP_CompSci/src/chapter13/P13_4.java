package chapter13;

public class P13_4{
    public static void main (String [] args){
        String toSearch = "This is a sentance.";
        String toFind = "This";
        System.out.println(search(toSearch, toFind, toSearch.length()));
        
    }
    public static boolean search(String toSearch, String toFind, int i){
        if(i == 0){
            return false;
        }
        if (toSearch.charAt(i) == toFind.charAt(0)){
           // if ()
        }
        return search(toSearch, toFind, i-1);
    }   
}