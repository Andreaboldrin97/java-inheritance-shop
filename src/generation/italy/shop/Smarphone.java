package generation.italy.shop;

//SUB CLASS
//la classe Smarphon estente la classe prodotto

public class Smarphone extends Prodotto{
	
	// variabili d'istanza
		private String codImei;
		private int rom;
		
		public Smarphone(String nomeProduct, String brand, int price, String codImei, int rom ) {
			
			// chiamo il costruttore della classe Prodotto
			super(nomeProduct, brand, price);
			this.codImei = codImei;
			this.rom = rom;
		}
		
		// metodi get e set
		public String getCodImei() {
			return codImei;
		}

		public void setCodImei(String codImei) {
			this.codImei = codImei;
		}

		public int getRom() {
			return rom;
		}

		public void setRom(int rom) {
			this.rom = rom;
		}

		// concatenzaione con il toString della classe prodotto
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() 
					+ "\nCodice IMEI : " + codImei
					+ "\nGrandezza memoria[ ROM ]: " + rom;
		}
}
