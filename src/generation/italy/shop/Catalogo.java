package generation.italy.shop;

import java.util.Scanner;

/*
 * BONUS
Create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti con dati inseriti tramite scanner. 
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo un o Smarphone o un Televisore o Cuffie
 e in base alla scelta dell’utente utilizzate il costruttore opportuno. 
 Al termine dell’inserimento stampate il catalogo 
 (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)*/

public class Catalogo {
	
	//cuffie
	//String nomeProduct, String brand, int price, String colore, boolean isWireless 
	
	//Smartphone 
	//String nomeProduct, String brand, int price, String codImei, int giga 
	
	//Televisori
	//String nomeProduct, String brand, int price, int tvSize, boolean isSmartTv
	
	public static void main(String[] args) {
		
		// creazione array di prodotti
		Prodotto[] products = new Prodotto[5];
		
		// apro lo scanner
		Scanner sc = new Scanner(System.in);
		
		// inizializzo un ciclo
		for( int i = 0 ; i < products.length ; i++) {
			
			System.out.println("Dimmi il nome del prodotto ..");
			String nomeProduct = sc.nextLine();
			
			System.out.println("Dimmi il nome della marca ..");
			String brand = sc.nextLine();
			
			System.out.println("Dimmi il prezzo del prodotto ( senza iva )..");
			String priceStr = sc.nextLine();
			// conversione in int
			int price = Integer.parseInt(priceStr);
			
			System.out.println("Scrivi la categoria di cui fa parte per continuare ...");
			System.out.println("TV , Smartphone, Cuffie");
			String userChoise = sc.nextLine();
			System.out.println(userChoise);
			
			// condizione switch per l'uguaglianza della scelta
			switch(userChoise.toLowerCase()) {
			
			case "tv" :
				System.out.println("Dimmi la grandezza della TV ..");
				String tvSizeS = sc.nextLine();
				// conversione in int
				int tvSize = Integer.parseInt(tvSizeS);
				
				System.out.println("E' una smart TV ( rispondi con TRUE o FALSE ..");
				String isSmartTvStr = sc.nextLine();
				// conversione in boolean
				boolean isSmartTv = Boolean.parseBoolean(isSmartTvStr);
				
				// associazione prodotto Tv
				Televisori tv = new Televisori(nomeProduct, brand, price, tvSize, isSmartTv);
				products[i] = tv ;
				
				break;
			case "smartphone" :
				System.out.println("Quanti giga di memoria ha il telefono ..");
				String gigaStr  = sc.nextLine();
				// conversione in int
				int giga = Integer.parseInt(gigaStr);
				
				System.out.println("Inserisci il codice IMEI ..");
				String codImei = sc.nextLine();
				
				// associazione prodotto phone
				Smarphone phone = new Smarphone(nomeProduct, brand, price, codImei, giga);
				products[i] = phone ;
				break;
			case "cuffie" :
				System.out.println("Di colore sono ..");
				String colore  = sc.nextLine();
				
				System.out.println("Sono Wireless ( rispondi con TRUE o FALSE ..");
				String isWirelessStr = sc.nextLine();
				// conversione in boolean
				boolean isWireless = Boolean.parseBoolean(isWirelessStr);
				// associazione prodotto headphone
				Cuffie headphone = new Cuffie(nomeProduct, brand, price, colore, isWireless);
				products[i] = headphone;
				break;
			}
			System.out.println("-----------------");
			
		}
		
		//chiudo lo scanner
		sc.close();
		//stampio tutto l'array
		System.out.println("Catalogo: ");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
			System.out.println("--------------");
		}
		
	}

}
