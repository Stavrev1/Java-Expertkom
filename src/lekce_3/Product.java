package lekce_3;

public class Product {
	
	public static int cena;
	public static String name;
	
	public Product(int cena, String name) {
		this.cena = 7;
		this.name = "Banan";
	}
	
	public static void main(String[] args) {
		Product ovoce = new Product(cena, name);
		System.out.println("Muj product je "+ ovoce.name +" a jeho cena je "+ ovoce.cena +" Kè.");
			
	}

}
