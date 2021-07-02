package turtle;

public class Turtle {
	public static String food = "Turtle Feed";
	private int age;
	private int tankNum;
	public static int numTanks = 3;
	
	
	public Turtle(int age) {
		this.age = age;
		tankNum = (int) ((Math.random() * numTanks) + 1);
	}
	
	public int getAge( ) {
		return age;
	}
	public int getTankOfResidence() {
		return tankNum;
	}
	
	public static String fishTank() {
		return "I have " + numTanks + " fish tanks.";
	}
}
