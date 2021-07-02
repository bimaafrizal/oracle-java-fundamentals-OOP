package shape;

public class square extends rectangle {
	private int sisi;
	public square(int panjang, int lebar) {
		super(panjang, lebar);
		// TODO Auto-generated constructor stub
	}
	
	public void setSisi(int panjang, int lebar) {
		if(panjang == lebar) {
			this.sisi = panjang;
		}
		else {
			System.out.println("Bukan segi empat");
		}
	}
	
	public double hitungLuas() {
		return sisi*sisi;
	}
	
}
