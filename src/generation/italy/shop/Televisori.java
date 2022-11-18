package generation.italy.shop;

//SUB CLASS
//la classe Televisori estente la classe prodotto

public class Televisori extends Prodotto{

	// variabili d'istanza
			private int tvSize;
			private boolean isSmartTv;
			
			public Televisori(String nomeProduct, String brand, int price, int tvSize, boolean isSmartTv) {
				
				// chiamo il costruttore della classe Prodotto
				super(nomeProduct, brand, price);
				this.tvSize = tvSize;
				this.isSmartTv = isSmartTv;
			}
			
			// metodi get e set
			public int getTvSize() {
				return tvSize;
			}

			public void setTvSize(int tvSize) {
				this.tvSize = tvSize;
			}

			public boolean isSmartTv() {
				return isSmartTv;
			}

			public void setSmartTv(boolean isSmartTv) {
				this.isSmartTv = isSmartTv;
			}
			
			// concatenzaione con il toString della classe prodotto
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString() 
						+ "\nGrandezza Tv : " + getTvSize()
						+ "\nCompatibile con tv smart: " + isSmartTv();
			}
}
