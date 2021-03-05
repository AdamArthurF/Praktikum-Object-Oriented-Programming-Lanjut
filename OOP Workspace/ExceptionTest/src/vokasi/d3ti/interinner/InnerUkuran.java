package vokasi.d3ti.interinner;

public class InnerUkuran {

	class BesarUkuran {
		double besar = 0;
		int awal = 0;
		int akhir = 0;
		double pengali = 1;
		
		BesarUkuran(String awal, String akhir, double besar) {
			switch(awal) {
				case "km": this.awal = 1; break;
				case "hm": this.awal = 2; break;
				case "dam": this.awal = 3; break;
				case "m": this.awal = 4; break;
				case "dm": this.awal = 5; break;
				case "cm": this.awal = 6; break;
				case "mm": this.awal = 7; break;
			}
			
			switch(akhir) {
				case "km": this.awal = 1; break;
				case "hm": this.awal = 2; break;
				case "dam": this.awal = 3; break;
				case "m": this.awal = 4; break;
				case "dm": this.awal = 5; break;
				case "cm": this.awal = 6; break;
				case "mm": this.awal = 7; break;			
			}
			
			this.besar = besar;
		}

		public double getBesar() {
			return this.besar;
		}

		public void setBesar(double besar) {
			this.besar = besar;
		}
		
		public double getSelisih() {
			int selisih = 0;
			selisih = this.awal - this.akhir;
			if (selisih > 0) {
				for (int i = 0; i < selisih; i++) {
					this.pengali = this.pengali / 10;
				}
			} else if (selisih < 0) {
				for (int i = 0; i < selisih; i++) {
					this.pengali = this.pengali * 10;
				}
			}
			return this.pengali;
		}
	}
	
	double hasil = 0;
	BesarUkuran besar = new BesarUkuran("m", "mm", 2);
	public InnerUkuran() {
		hasil = besar.getBesar() * besar.getSelisih();
	}
	
	public static void main(String[] args) {
		InnerUkuran cetak = new InnerUkuran();
		System.out.println(cetak);
	}
}
