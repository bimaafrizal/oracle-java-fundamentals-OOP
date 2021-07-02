package Person;

import java.util.Date;

public class Person {
		private String namaDepan;
		private String namaTengah;
		private String namaBelakang;
		private Date tanggalLahir;
		
		public Person(String nDepan, String nTengah, String nBelakang, Date tglLahir){
			this.namaDepan = nDepan;
			this.namaTengah= nTengah;
			this.namaBelakang = nBelakang;
			this.tanggalLahir = tglLahir; 
		}
		
		public String getNamaDepan(){ 
			return namaDepan; 
		}
		public String getNamaTengah(){ 
			return namaTengah; 
		}
		
		public String getNamaBelakang(){ 
			return namaBelakang; 
		}
		
		public String getNama(){ 
			return namaDepan + " " + namaTengah + " " +
		namaBelakang; 
		}
		public Date getTanggalLahir(){
			return tanggalLahir;
		}
}
