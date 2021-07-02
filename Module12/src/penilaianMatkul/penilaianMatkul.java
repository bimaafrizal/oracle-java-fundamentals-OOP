package penilaianMatkul;

import java.util.*;
import java.util.stream.*;

public class penilaianMatkul {

	public static void main(String[] args) {
		// deklarasi
		Scanner scan = new Scanner(System.in);
		int nilai = 0;
		double simpanNilai [] = new double[4];
		double sum;
		
		//input
		for(int i = 0; i < simpanNilai.length; i++) {
			System.out.println("Masukan nilai ke " + (i+1));
			nilai = scan.nextInt();
			simpanNilai[i] = nilai;
		}
		
		System.out.println(" ");
		
		//output
		if(nilai <= 100 && nilai > 0 ) {
			//PERHITUNGAN
			simpanNilai[0] = simpanNilai[0] * 0.1;
			simpanNilai[1] = simpanNilai[0] * 0.2;
			simpanNilai[2] = simpanNilai[0] * 0.2;
			simpanNilai[3] = simpanNilai[0] * 0.5;
			
			sum  = DoubleStream.of(simpanNilai).sum();
			System.out.println(sum);
			
		} else {
			System.out.println("Angka yang dimasukan tidak valid");
		}
	}
}
