package Person;

import java.util.*;

public class driverMahasiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int nilai, jmlhMatkul, nilaiAkhir;
		
		Mahasiswa m1 = new Mahasiswa("Bima", "Afrizal", "Malna", null, "V3420018", 4, "D3Ti","Diploma", 2020);
		Person p1 = new Person("Bima", "Afrizal", "Malna", null);
		
		System.out.println("Input nilai! ");
		nilai = input.nextInt();
		System.out.println("Input jumlah matkul! ");
		jmlhMatkul = input.nextInt();
		
		nilaiAkhir = nilai / jmlhMatkul;
		m1.setIPK(nilaiAkhir);
		
		System.out.println(p1.getNama());
		System.out.println(p1.getNamaDepan());
		System.out.println(p1.getNamaTengah());
		System.out.println(p1.getNamaBelakang());
		
		System.out.println(m1.getNIM());
		System.out.println(m1.getIPK());
		System.out.println(m1.getProdi());
		System.out.println(m1.getStrata());
		System.out.println(m1.getTahunMasuk());
		
		System.out.println("");
		System.out.println(m1.hitungIPK(nilaiAkhir));
	}
}
