package tugas;

public class InnerUkuran {
	
	class BesarSuhu {
		TransformasiSuhu ts = new TransformasiSuhu() {
			
			@Override
			public double CelsiustoFarenheit(double celsius) {
				return (celsius * 9 / 5) + FARENHEIT;
			}

			@Override
			public double CelsiustoReamur(double celsius) {
				return celsius * 4 / 5;
			}

			@Override
			public double FarenheittoCelsius(double farenheit) {
				return (farenheit - 32) * 5 / 9;
			}

			@Override
			public double FarenheittoReamur(double farenheit) {
				return (farenheit-32) * 4 / 9;
			}

			@Override
			public double ReamurttoCelsius(double reamur) {
				return reamur * 5 / 4;
			}

			@Override
			public double ReamurttoFarenheit(double reamur) {
				return 9/4 * reamur + FARENHEIT;
			}
			
		};
			
	}
	
	class BesarUkuran {
		private double nilai = 0.0d, pengali = 1d;
		private int awal = 0, akhir = 0;
		
		public BesarUkuran(String awal, String akhir, double nilai) {
			switch(awal){
				case "km"	: this.awal = 1; break;
				case "hm"	: this.awal = 2; break;
				case "dam"	: this.awal = 3; break;
				case "m"	: this.awal = 4; break;
				case "dm"	: this.awal = 5; break;
				case "cm"	: this.awal = 6; break;
				case "mm"	: this.awal = 7; break;
			}
			switch(akhir){
				case "km"	: this.akhir = 1; break;
				case "hm"	: this.akhir = 2; break;
				case "dam"	: this.akhir = 3; break;
				case "m"	: this.akhir = 4; break;
				case "dm"	: this.akhir = 5; break;
				case "cm"	: this.akhir = 6; break;
				case "mm"	: this.akhir = 7; break;
			}
			this.nilai = nilai;
		}
		
		private double getPengali() {
			int selisih = 0;
			selisih = this.awal - this.akhir;
			if(selisih > 0) {
				for(int i = 0; i < selisih; i++ ){
					pengali = pengali / 10;
				}
			} else if (selisih < 0){
				for(int i = selisih ; i < 0; i++){
					pengali = pengali * 10;
				}
			}
			return pengali;
		}
		
		private double getNilai() {
			return this.nilai;
		}
	}
	
	public double hasilUkuran, hasilSuhu;
	BesarUkuran besarUkuran = new BesarUkuran("m", "mm", 2.0);
	BesarSuhu besarSuhu = new BesarSuhu();
	public InnerUkuran() {
		this.hasilUkuran = this.besarUkuran.getNilai() * this.besarUkuran.getPengali();
		this.hasilSuhu = this.besarSuhu.ts.CelsiustoFarenheit(12); // Celsius ke Fahrenheit
	}
	
	public double getHasilUkuran(){
		return this.hasilUkuran;
	}
	
	public double getHasilSuhu() {
		return this.hasilSuhu;
	}
	
}
