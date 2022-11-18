package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		
		// creazio prodotti casuali
		
		//cuffie
		//String nomeProduct, String brand, int price, String colore, boolean isWireless 
		Cuffie headphone = new Cuffie("AirPods" , "Apple", 120, "white", true);
		System.out.println(headphone);
		System.out.println("----------------------");
	}
}
