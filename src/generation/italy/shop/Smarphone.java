package generation.italy.shop;

//SUB CLASS
//la classe Smarphon estente la classe prodotto

public class Smarphone extends Prodotto{
	
	// variabili d'istanza
		private String codImei;
		private int giga;
		
		public Smarphone(String nomeProduct, String brand, int price, String codImei, int giga ) {
			
			// chiamo il costruttore della classe Prodotto
			super(nomeProduct, brand, price);
			this.codImei = codImei;
			this.giga = giga;
		}
		
		// metodi get e set
		public String getCodImei() {
			return codImei;
		}

		public void setCodImei(String codImei) {
			this.codImei = codImei;
		}

		public int getGiga() {
			return giga;
		}

		public void setGiga(int giga) {
			this.giga = giga;
		}

		// concatenzaione con il toString della classe prodotto
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() 
					+ "\nCodice IMEI : " + codImei
					+ "\nGrandezza memoria[ giga ]: " + giga;
		}
}
