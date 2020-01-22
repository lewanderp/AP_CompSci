package chapter13;

public class P13_4{
    public static void main (String [] args){
        String toSearch = "This is a sentance.";
        String toFind = "is ";
        System.out.println(search(toSearch, toFind, toSearch.length()-1));
        
    }
    public static boolean search(String toSearch, String toFind, int i){
        if (toSearch.substring(0,toFind.length()-1).equals(toFind)){
            return true;
        } else {
            return search(toSearch.substring(1), toFind, i - 1);
        }
    }   
}