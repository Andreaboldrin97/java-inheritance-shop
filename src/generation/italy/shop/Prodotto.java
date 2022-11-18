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
	public String getNomeProduct() {
			return nomeProduct;
		}

		public void setNomeProduct(String nomeProduct) {
			this.nomeProduct = nomeProduct;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getIva() {
			return iva;
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
