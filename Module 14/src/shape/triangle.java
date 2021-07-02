package shape;

public class triangle extends shape{
	private int alas, tinggi;
	
	public triangle(int alas, int tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public void setAlas(int alas) {
		this.alas = alas;
	}
	
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	
	public int getAlas() {
		return alas;
	}
	
	public int getTinggi() {
		return tinggi;
	}
	
	@Override
	double hitungLuas() {
		// TODO Auto-generated method stub
		return 0.5 * alas * tinggi;
	}
}
