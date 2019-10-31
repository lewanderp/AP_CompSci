package chapter5;

public class P5_2_Class {
	
	private String suit = "AXC4";
	private String type = "AXC4";
	
	P5_2_Class(String name){
		if (name.length() > 3) {
			suit = "Unknown";
			type = "";
		} else {
			defCard(name);
		}
		if (suit.contentEquals("AXC4") || type.contentEquals("AXC4")) {
			suit = "Unknown";
			type = "";
		}
	}
	private void defCard(String name) {
		defSuit(name);
		defType(name);
	}
	private void defSuit(String name) {
		 switch (name.charAt(1)) {
		 	case 'D':
		 		suit = "Diamonds";
		 		break;
		 	case 'H':
		 		suit = "Hearts";
		 		break;
		 	case 'S':
		 		suit = "Spades";
		 		break;
		 	case 'C':
		 		suit = "Clubs";
		 		break; 
		 		
		 }
	}
	private void defType(String name) {
		switch (name.charAt(0)) {
			case 'A':
				type = "Ace";
				break;
			case '1':
				if (name.length() == 3) {
					type = "10";
				}
				break;
			case '2':
				type = "2";
				break;
			case '3':
				type = "3";
				break;
			case '4':
				type = "4";
				break;
			case '5':
				type = "5";
				break;
			case '6':
				type = "6";
				break;
			case '7':
				type = "7";
				break;
			case '8':
				type = "8";
				break;
			case '9':
				type = "9";
				break;
			case 'J':
				type = "J";
				break;
			case 'Q':
				type = "Q";
				break;
			case 'K':
				type = "K";
				break;
		}
	}
	public String cardToString() {
		if (suit.contentEquals("Unknown")) {
			return "Unknown";
		} else {
			return (type + " of " + suit);
		}
	}
}
