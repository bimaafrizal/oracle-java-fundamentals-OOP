package Person;

import java.util.Date;

public class Mahasiswa extends Person{
	private String NIM;
	private float IPK;
	private String Prodi;
	private String Strata;
	private int tahunMasuk;
	

	public Mahasiswa(String nDepan, String nTengah, String nBelakang, Date tglLahir) {
		super(nDepan, nTengah, nBelakang, tglLahir);
		
		// TODO Auto-generated constructor stub
	}
	
	public Mahasiswa(String nDepan, String nTengah, String nBelakang, Date tglLahir, String NIM, float IPK, String Prodi, String Strata, int tahunMasuk) {
		// TODO Auto-generated constructor stub
		super(nDepan, nTengah, nBelakang, tglLahir);
		this.NIM = NIM;
		this.IPK = IPK;
		this.Prodi = Prodi;
		this.Strata = Strata;
		this.tahunMasuk = tahunMasuk;
	}
	
	public void setNIM(String NIM) {
		this.NIM = NIM;
	}
	public void setIPK(float IPK) {
		this.IPK = IPK;
	}
	public void setProdi(String Prodi) {
		this.Prodi = Prodi;
	}
	public void setStrata(String Strata) {
		this.Strata = Strata;
	}
	public void setTahunMasuk(int tahunMasuk) {
		this.tahunMasuk = tahunMasuk;
	}
	
	public String getNIM() {
		return this.NIM;
	}
	public float getIPK() {
		return this.IPK;
	}
	public String getProdi() {
		return this.Prodi;
	}
	public String getStrata() {
		return this.Strata;
	}
	public int getTahunMasuk() {
		return this.tahunMasuk;
	}
	
	String[] ipk = {"A", "A-", "B+", "B", "B-", "C+", "C", "D", "E"};
	
	public String hitungIPK(float newIpk) {
		String ipkHuruf = "";
		if(newIpk >= 4) {
			ipkHuruf = ipk[0];
		} else if (newIpk >= 3.67 ) {
			ipkHuruf = ipk[1];
		} else if(newIpk >= 3.33) {
			ipkHuruf = ipk[2];
		}else if(newIpk >= 2.67) {
			ipkHuruf = ipk[3];
		}else if(newIpk >= 2.33) {
			ipkHuruf =ipk[4];
		}else if(newIpk >= 2) {
			ipkHuruf = ipk[5];
		}else if(newIpk >= 1) {
			ipkHuruf = ipk[6];
		}else if(newIpk >= 0) {
			ipkHuruf = ipk[7];
		}
		return ipkHuruf;
	}
			
} 
