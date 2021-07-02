package Segitiga;
 import java.util.*;
 
public class Managingsegitiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alas;
		int tinggi;
		double luas;
		
		
		System.out.println("Masukan Alas");
		alas = sc.nextInt();
		System.out.println("Masukan Tinggi");
		tinggi = sc.nextInt();

		segitiga s1 = new segitiga(alas, tinggi);
		
		
		luas = 0.5 * s1.getAlas() * s1.getTinggi();
		
		
		System.out.println(luas);
	}

}
