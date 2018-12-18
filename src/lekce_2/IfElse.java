package lekce_2;

import java.io.IOException;

public class IfElse {

	public static void main(String[] args) throws IOException {
		
		char answer = 'k';
		char navrh = (char) System.in.read();
		
		if (answer == navrh) {
			System.out.println("Promenna je K!");
		}
		else {
			System.out.println("Promenna neni K!");
		}
		

	}

}
