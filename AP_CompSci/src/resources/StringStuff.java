package resources;

public class StringStuff {
	
	public StringStuff() {
		
	}
	public boolean isVowel (int loc, String word) {
		boolean isVowel = false;
		if (word.charAt(loc) == 'a') {
			isVowel = true;
		}
		if (word.charAt(loc) == 'e') {
			isVowel = true;
		}
		if (word.charAt(loc) == 'i') {
			isVowel = true;
		}
		if (word.charAt(loc) == 'o') {
			isVowel = true;
		}
		if (word.charAt(loc) == 'u') {
			isVowel = true;
		}
		if (word.charAt(loc) == 'y') {
			for(int x = 0; x < word.length()-1; x++) {
				if (!whatVowel(x, word).contentEquals("not vowel")) {
					isVowel = false;
					break;
				} else {
					isVowel = true;
				}
			}
		}
		return isVowel;
	}
	public String whatVowel(int loc, String word) {
		String vowel = "not vowel";
		if (word.charAt(loc) == 'a') {
			vowel = "a";
		}
		if (word.charAt(loc) == 'e') {
			vowel = "e";
		}
		if (word.charAt(loc) == 'i') {
			vowel = "i";
		}
		if (word.charAt(loc) == 'o') {
			vowel = "o";
		}
		if (word.charAt(loc) == 'u') {
			vowel = "u";
		}
		if (word.charAt(loc) == 'y') {
			if (loc > 0) {
				vowel = "y";
			}
		}
		return vowel;
	}
	public boolean isUpperCase(int loc, String word) {
		boolean isUpperCase = false;
		if (word.charAt(loc) <= 90) {
			isUpperCase = true;
		}
		return isUpperCase;
	}
		
}
