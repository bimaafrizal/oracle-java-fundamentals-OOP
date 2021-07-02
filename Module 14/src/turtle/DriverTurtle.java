package turtle;

public class DriverTurtle {

	public static void main(String[] args) {
		Turtle T1 = new Turtle(1);
		Turtle T2 = new Turtle(2);
		
		System.out.println("Jumlah tangki total adalah " + Turtle.numTanks);
		Turtle.numTanks = 5;
		System.out.println("Turtle T1 berusia" + T1.age + Turtle.numTanks);
		System.out.println("Turtle T1 nerafa di tangki nomor " + T1.tankNum);
		System.out.println(T1.fishTank());
		System.out.println("");
		System.out.println("Turtle T1 berusia" + T2.age + Turtle.numTanks);
		System.out.println("Turtle T1 nerafa di tangki nomor " + T2.tankNum);
		System.out.println(T2.fishTank());
	}

}
