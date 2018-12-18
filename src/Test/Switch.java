package Test;

public class Switch {

	public static void main(String[] args) {
		
		for (int a = 1; a < 10; a++)
			switch (a) {
			case 0:
				System.out.println("a je nula");
				break;
			case 1:
				System.out.println("a je jedna");
				break;
			case 2:
				System.out.println("a je dva");
				break;
			case 3:
				System.out.println("a je tri");
				break;
			case 4:
				System.out.println("a je ctyri");
				break;
			default:
				System.out.println("a je vice jak pet");
		}

	}

}
