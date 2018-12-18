package domaci_ukol_1;

public class ObjemKrychle {

	public static void main(String[] args) {
		long strana = 2852;
		long objem = strana * strana * strana;
		long povrch = 6 * (strana * strana);
				
		System.out.println("Povrch krychle: " + povrch);
		System.out.println("Objem krychle: " + objem);
	}
}
