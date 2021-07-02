package praktikum;
import java.util.*;

public class GalToLit {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double gallon;
		double convert;
		
		System.out.println("Masukan galon");
		gallon = sc.nextDouble();
		convert = gallon * 3785;
		
		System.out.println("Hasilnya adalah " + convert);
	}
}
