package generation.italy.shop;

// SUB CLASS
// la classe cuffie estente la classe prodotto


public class Cuffie extends Prodotto {
	
	// variabili d'istanza
	private String colore;
	private boolean isWireless;
	
	public Cuffie(int codeProduct, String nomeProduct, String brand, int price, String colore, boolean isWireless ) {
		
		// chiamo il costruttore della classe Prodotto
		super(codeProduct, nomeProduct, brand, price);
		this.colore = colore;
		this.isWireless = isWireless;
	}

	// metodi get e set
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	
}
