package domaci_ukol_2;

public class KontrolaPrvocisla {

	public static void main(String[] args) {
		
		boolean b = true;
		
		for (int i = 2; i < 97; i++) {
			
			if (97 % i == 0) {
				
				b = false;
				break;
			}
		}
		
		if (b && 97 > 1) {
			System.out.println("Cislo je prvocislem");
		}
		else {
			System.out.println("Cislo neni prvocislem");
		}
	}
}
