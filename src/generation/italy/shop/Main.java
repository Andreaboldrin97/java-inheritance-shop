package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		
		// creazio prodotti casuali
		
		//cuffie
		//String nomeProduct, String brand, int price, String colore, boolean isWireless 
		Cuffie headphone = new Cuffie("AirPods" , "Apple", 120, "white", true);
		System.out.println(headphone);
		System.out.println("----------------------");
		System.out.println("prezzo con iva : " + headphone.getTotalPrice());
		System.out.println("----------------------");
			
		//Smartphone 
		//String nomeProduct, String brand, int price, String codImei, int rom 
		Smarphone phone = new Smarphone("Iphone 14", "Apple", 1000, "01 234567 890123 4", 250);
		System.out.println(phone);
		System.out.println("----------------------");
		System.out.println("prezzo con iva : " + phone.getTotalPrice());
		System.out.println("----------------------");
		
		//Televisori
		//String nomeProduct, String brand, int price, int tvSize, boolean isSmartTv
		Televisori tvLg = new Televisori("tv xy-zdr", "LG", 2000, 65, true);
		System.out.println(tvLg);
		System.out.println("----------------------");
		System.out.println("prezzo con iva : " + tvLg.getTotalPrice());
		System.out.println("----------------------");
	}
}