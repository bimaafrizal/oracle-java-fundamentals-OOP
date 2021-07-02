package lulus;

import java.util.*;

public class ternaryLulus {

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
		
		String answer = (60 <= nilai && nilai <= 75 && bolos == 0) || (nilai > 75 && bolos <= 3)? "Anda Lulus" : "Anda tidak lulus";
		System.out.println(answer);
		
	}

}
