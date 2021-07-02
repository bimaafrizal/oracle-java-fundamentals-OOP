package lulus;

import java.util.*;

public class lulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nilai;
		int bolos;
		
		System.out.println("Maasukan nilai");
		nilai = sc.nextInt();
		System.out.println("Masukan Bolos");
		bolos = sc.nextInt();
		
		System.out.println(" ");
		
		if(nilai > 75 && bolos <= 3) {
			System.out.println("Anda lulus");
		}
		else if(60 <= nilai && nilai <= 75 && bolos == 0) {
			System.out.println("Anda lulus");
		}
		else {
			System.out.println("Anda tidak lulus");
		}
	}

}
