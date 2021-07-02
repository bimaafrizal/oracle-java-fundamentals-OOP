package shape;

public class circle extends shape {
	private int jejari;
	
	public circle(int jejari) {
		this.jejari = jejari;
	}
	
	public void setJejari(int jejari) {
		this.jejari = jejari;
	}
	
	@Override
	double hitungLuas() {
		// TODO Auto-generated method stub
		return Math.PI * jejari * jejari;
	}

}
