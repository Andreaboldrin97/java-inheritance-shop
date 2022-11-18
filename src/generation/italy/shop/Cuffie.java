package generation.italy.shop;

// SUB CLASS
// la classe cuffie estente la classe prodotto


public class Cuffie extends Prodotto {
	
	// variabili d'istanza
	private String colore;
	private boolean isWireless;
	
	public Cuffie(String nomeProduct, String brand, int price, String colore, boolean isWireless ) {
		
		// chiamo il costruttore della classe Prodotto
		super(nomeProduct, brand, price);
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
	
	
	// concatenzaione con il toString della classe prodotto
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() 
				+ "\nColore : " + getColore()
				+ "\nSono Wireless : " + isWireless();
	}
	
	
}
