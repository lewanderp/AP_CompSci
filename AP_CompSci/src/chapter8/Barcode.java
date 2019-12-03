package chapter8;

public class Barcode {
	
	private int [] zip = new int [5];
	private String [] bar = new String [5];
	
	public Barcode(int [] code) {
		this.preconditionsInt(code);
		for(int i = 0; i<5; i++) {
			zip[i] = code[i];
		}
	}
	public Barcode(String [] code) {
		this.preconditionsString(code);
		for(int i = 0; i<5; i++) {
			
		}
	}
	public String toBar() {
		String toPrint = "|";
		for(int i = 0; i<5; i++) {
			toPrint = toPrint+this.numToBar(zip[i]);
		}
		toPrint = toPrint + "|";
		return toPrint; 
	}
	public String toNum() {
		String toPrint = "";
		for (int i = 0; i < 5; i++) {
			toPrint = toPrint+this.barToNum(bar[i]);
		}
		return toPrint;
	}
	private void preconditionsInt(int [] code) {
		if (code.length != 5) {
			throw new IllegalArgumentException("Code length must be 5");
		}
	}
	private void preconditionsString(String [] code) {
		if (code.length != 5) {
			throw new IllegalArgumentException("Code length must be 5");
		}
	}
	private String numToBar(int toBar) {
		switch (toBar) {
		case 1:
			return ":::||";
		case 2:
			return "::|:|";
		case 3:
			return "::||:";
		case 4:
			return ":|::|";
		case 5:
			return ":|:|:";
		case 6:
			return ":||::";
		case 7:
			return "|:::|";
		case 8:
			return "|::|:";
		case 9:
			return "|:|::";
		case 0:
			return "||:::";
		}
		throw new IllegalArgumentException("NaN");
	}
	@SuppressWarnings("unused")
	private int barToNum(String toNum) {
		switch (toNum) {
		case ":::||":
			return 1;
		case "::|:|":
			return 2;
		case "::||:":
			return 3;
		case ":|::|":
			return 4;
		case ":|:|:":
			return 5;
		case ":||::":
			return 6;
		case "|:::|":
			return 7;
		case "|::|:":
			return 8;
		case "|:|::":
			return 9;
		case "||:::":
			return 0;
		}
		throw new IllegalArgumentException("Not Valid Barcode");
	}
	
}
