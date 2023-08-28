package pixelart;

public class Colors {
	final String BLACK = "\u001B[30m\u001B[40m";
	final String RED = "\u001B[31m\u001B[41m";
	final String GREEN = "\u001B[32m\u001B[42m";
	final String YELLOW = "\u001B[33m\u001B[43m";
	final String BLUE = "\u001B[34m\u001B[44m";
	final String PURPLE = "\u001B[35m\u001B[45m";
	final String CYAN = "\u001B[36m\u001B[46m";
	final String WHITE = "\u001B[37m\u001B[47m";
	final String RESET = "\u001B[0m\u001B[0m";
	
	private String printBlack(String str) {
		return BLACK + str + RESET; 
	}
	private String printRed(String str) {
		return RED + str + RESET; 
	}
	private String printGreen(String str) {
		return GREEN + str + RESET; 
	}
	private String printYellow(String str) {
		return YELLOW + str + RESET; 
	}
	private String printBlue(String str) {
		return BLUE + str + RESET; 
	}
	private String printPurple(String str) {
		return PURPLE + str + RESET; 
	}
	private String printCyan(String str) {
		return CYAN + str + RESET; 
	}
	private String printWhite(String str) {
		return WHITE + str + RESET; 
	}
	
	private String setPixel(int count) {
		String str = "";
		for(int i = 0;i<count;i++) {
			str += "aa";
		}
		return str;
	}
	
	void printPixelBlack(int count) {
		System.out.print(printBlack(setPixel(count)));
	}
	void printPixelBlack(int count, boolean isLn) {
		System.out.println(printBlack(setPixel(count)));
	}

	void printPixelRed(int count) {
		System.out.print(printRed(setPixel(count)));
	}
	void printPixelRed(int count, boolean isLn) {
		System.out.println(printRed(setPixel(count)));
	}

	void printPixelGreen(int count) {
		System.out.print(printGreen(setPixel(count)));
	}
	void printPixelGreen(int count, boolean isLn) {
		System.out.println(printGreen(setPixel(count)));
	}

	void printPixelYellow(int count) {
		System.out.print(printYellow(setPixel(count)));
	}
	void printPixelYellow(int count, boolean isLn) {
		System.out.println(printYellow(setPixel(count)));
	}

	void printPixelBlue(int count) {
		System.out.print(printBlue(setPixel(count)));
	}
	void printPixelBlue(int count, boolean isLn) {
		System.out.println(printBlue(setPixel(count)));
	}

	void printPixelPurple(int count) {
		System.out.print(printPurple(setPixel(count)));
	}
	void printPixelPurple(int count, boolean isLn) {
		System.out.println(printPurple(setPixel(count)));
	}
	
	void printPixelCyan(int count) {
		System.out.print(printCyan(setPixel(count)));
	}
	void printPixelCyan(int count, boolean isLn) {
		System.out.println(printCyan(setPixel(count)));
	}

	void printPixelWhite(int count) {
		System.out.print(printWhite(setPixel(count)));
	}
	void printPixelWhite(int count, boolean isLn) {
		System.out.println(printWhite(setPixel(count)));
	}
}
