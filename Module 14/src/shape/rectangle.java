package shape;

public class rectangle extends shape {
	private int panjang;
	private int lebar;
	
	public rectangle(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	public int getPanjang() {
		return panjang;
	}
	
	public int getLebar() {
		return lebar;
	}
	
	@Override
	double hitungLuas() {
		// TODO Auto-generated method stub
		return panjang * lebar;
	}
}
