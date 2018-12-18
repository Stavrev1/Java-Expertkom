package domaci_ukol_1;

public class Prvocisla {

	public static void main(String[] args) {
		
		for(int a = 2; a <= 200; a++) {
		
			for(int b = 2; b <= a; b++) {
				
				if(b == a) {
					System.out.println(a);
				}
				
				if (a % b == 0) {
					break;
				}
			}
		}
	}
}