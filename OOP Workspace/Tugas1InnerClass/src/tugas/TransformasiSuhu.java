package tugas;

public interface TransformasiSuhu {
	final int FARENHEIT = 32;
	public double CelsiustoFarenheit(double celsius);
	public double CelsiustoReamur(double celsius);
	public double FarenheittoCelsius(double farenheit);
	public double FarenheittoReamur(double farenheit);
	public double ReamurttoCelsius(double reamur);
	public double ReamurttoFarenheit(double reamur);
}
