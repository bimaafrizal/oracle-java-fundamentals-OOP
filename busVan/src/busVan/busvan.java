package busVan;

import java.util.*;

public class busvan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int penumpang;
		int bus;
		int van;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukan jumlah penumpang");
		penumpang = sc.nextInt();
		
		if(penumpang <= 45) {
			System.out.println("Jumlah penummpang " + penumpang);
			System.out.println("Butuh satu bus dan 0 van");
		}
		else {
			bus = penumpang / 45;
			van = penumpang % 45;
			
			System.out.println("Jumlah penummpang " + penumpang);
			System.out.println("Jumlah bis " + bus);
			System.out.println("Penumpang dalam van " + van);
		}
	}

}
