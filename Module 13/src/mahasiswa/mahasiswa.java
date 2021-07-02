package mahasiswa;

public class mahasiswa {
	String nama;
	String NIM;
	String prodi;
	String status;
	double IPK;
	mahasiswa(String nama, String NIM) {
		this.nama = nama;
		this.NIM = NIM;
	}
	
	mahasiswa(String nama, String NIM, String prodi) {
		this.nama = nama;
		this.NIM = NIM;
		this.prodi = prodi;
	}
	
	mahasiswa(String nama, String NIM, String prodi, double IPK, String status) {
		this.nama = nama;
		this.NIM = NIM;
		this.prodi = prodi;
		this.status = status;
		this.IPK = IPK;	
	}
	
	void cetakMahasiswa() {
		System.out.println("Nama " + nama);
		System.out.println("NIM " + NIM);
		System.out.println("Prodi " + prodi);
		System.out.println("IPK " + IPK);
		System.out.println("Status " + status);
	}
	
	public static void main (String [] args) {
		mahasiswa m1 = new mahasiswa("bima","V3420018");
		mahasiswa m2 = new mahasiswa("bima","V3420018", "D3TI");
		mahasiswa m3 = new mahasiswa("bima","V3420018", "D3TI", 4, "Aktif");
		
		m1.cetakMahasiswa();
		System.out.println(" ");
		m2.cetakMahasiswa();
		System.out.println(" ");
		m3.cetakMahasiswa();
	}
}
