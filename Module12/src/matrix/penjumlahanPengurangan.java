package matrix;

import java.util.*;

public class penjumlahanPengurangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] [] matrix1 = new int[2] [2];
		int [] [] matrix2 = new int[2] [2];
		int [] [] hasil = new int [2] [2];
		boolean statusExit = false;
		
		do {
			System.out.println("Masukan pilihan anda!\n1. Penjumlahan\n2. Kurang\n3. Exit\nChose:");
            int pilihan = scan.nextInt();
            switch(pilihan){
            	case 1:
            		System.out.println("Masukkan elemen matriks pertama: ");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            matrix1[i][j] = scan.nextInt();
                        }
                    }
                    System.out.println("Masukkan elemen matriks kedua: ");
                    for (int i = 0; i < matrix2.length; i++) {
                        for (int j = 0; j < matrix2[0].length; j++) {
                        matrix2[i][j] = scan.nextInt();
                        }
                    }
                    System.out.println("Hasil penjumlahan matriks: ");
                    for (int i = 0; i < hasil.length; i++) {
                        for (int j = 0; j < hasil[0].length; j++) {
                        hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                        }
                    System.out.println();
                    }
                    statusExit = true;
                    break;
                    
            	case 2 :
            		System.out.println("Masukkan elemen matriks pertama: ");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            matrix1[i][j] = scan.nextInt();
                        }
                    }
                    System.out.println("Masukkan elemen matriks kedua: ");
                    for (int i = 0; i < matrix2.length; i++) {
                        for (int j = 0; j < matrix2[0].length; j++) {
                        matrix2[i][j] = scan.nextInt();
                        }
                    }
                    System.out.println("Hasil penjumlahan matriks: ");
                    for (int i = 0; i < hasil.length; i++) {
                        for (int j = 0; j < hasil[0].length; j++) {
                        hasil[i][j] = matrix1[i][j] - matrix2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                        }
                    System.out.println();
                    }
                    statusExit = true;
                    break;
                    
            	case 3 :
            		System.out.println("Terimakasih sudah mencoba");
                    statusExit = true;
                    break;
                    
               default :
                    System.out.println("Eror");
                    statusExit = true;
                    break; 
            }
		} while(!statusExit);
	}

}
