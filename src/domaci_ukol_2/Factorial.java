package domaci_ukol_2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int faktorial = 1;
		for (int i = 1; i <= 10; i++) {
			
			faktorial = faktorial * i;
			
			System.out.println(faktorial);
		}
	}
}
