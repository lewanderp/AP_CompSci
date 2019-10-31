package chapter2;

import java.lang.String;

public class P2_9 {
	public static void main (String [] args) {
		String wrd = "Mississippi";
		String wrd2 = wrd.replace('s', '$');
		wrd2 = wrd2.replace('i', '!');
		System.out.println(wrd2);
	}
}
