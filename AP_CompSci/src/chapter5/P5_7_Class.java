package chapter5;

public class P5_7_Class {
	
	private String words[] = new String[3];
	
	P5_7_Class(String a, String b, String c) {
		words[0] = a;
		words[1] = b;
		words[2] = c;
	}
	public String wordsToString() {
		String toPrint = "[ "+ words[0]+", "+ words[1]+", "+ words[2]+" ]";
		return toPrint;
	}
	public void sortWords() {
		int n = words.length; 
        for (int i = 0; i < n-1; i++) {
        	for (int j = 0; j < n-i-1; j++) {
        		if (words[j].compareTo(words[j+1]) > 0) {
                    String temp = words[j]; 
                    words[j] = words[j+1]; 
                    words[j+1] = temp; 
                }
        	}      
        }
	}
}
