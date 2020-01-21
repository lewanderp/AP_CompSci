package chapter13;

public class P13_4{
    public static void main (String [] args){
        String toSearch = "This is a sentance.";
        String toFind = "is ";
        System.out.println(search(toSearch, toFind, toSearch.length()));
        
    }
    public static boolean search(String toSearch, String toFind, int i){
        if(i == 0){
            return false;
        }
        if (toSearch.charAt(i) == toFind.charAt(0)){
            search(toSearch.subString(1,toSearch.length()-1), toFind.subString(1,toFind.length()-1), i);
        }
        return search(toSearch.subString(1,toSearch.length()-1), toFind, i-1);
    }   
}