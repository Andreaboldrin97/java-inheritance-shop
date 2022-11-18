package generation.italy.shop;

// SUPER CLASSE
public class Prodotto {

	// variabili d'istanza
	private int codeProduct;
	private String nomeProduct;
	private String brand;
	private int price;
	private int iva;
	
	// costruttore
	public Prodotto(int codeProduct, String nomeProduct, String brand, int price) {
		
		// assegnazine
		this.codeProduct = codeProduct;
		this.nomeProduct = nomeProduct;
		this.brand = brand;
		this.price = price;
		iva = 20;
	}
	
	// metodi get e set
	public int getCodeProduct() {
		return codeProduct;
	}
	public void setCodeProduct(int codeProduct) {
		this.codeProduct = codeProduct;
	}
	
	// metodo che restituisce il prezzo più l'iva
		public int getTotalPrice(int codeProduc) {
			return price + ( price * iva / 100);
		}
	
	
	// metodo toString
	@Override
	public String toString() {
		
		return "Codice prodotto : " + codeProduct
				+ "\nNome prodotto : " + nomeProduct
				+ "\nMarca prodotto : " + brand
				+ 	"\nPrezzo senza iva : " + price;
			
	}

}
