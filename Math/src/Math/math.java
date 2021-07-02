package Math;
import java.util.*;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean statusExit = false;
		
		do {
			System.out.println("Masukan pilihan anda untuk mencoba");
			System.out.println("Pilihan anda dari 1 - 5");
			int pilihan = input.nextInt();
			switch(pilihan) {
			case 1:
				//deklarasi & inputan
				double x;
				System.out.println("Masukan nilai x");
				x =input.nextInt();
				
				System.out.println(nomorSatu(x));
				statusExit = true;
		        break;
		        
			case 2:
				//deklarasi
				double x2;
				double y;
				//inputan
				System.out.println("Masukan nilai x");
				x2 = input.nextInt();
				System.out.println("Masukan nilai y");
				y = input.nextInt();
				
				System.out.println(nomorDua(x2,y));
				statusExit = true;
                break;
                
			case 3:
				//deklarasi
				double z;
				double x3;
				
				//input
				System.out.println("Masukan nilai x");
				x3 = input.nextInt();
				System.out.println("Masukan nilai z");
				z = input.nextInt();
				
				//perhitungam
				System.out.println(nomorTiga(z, x3));
				statusExit = true;
                break;
                
			case 4:
				//deklarasi
				double x4;
				double y4;
				
				//inputan
				System.out.println("Masukan nilai x");
				x4 = input.nextInt();
				System.out.println("Masukan nilai y");
				y4 = input.nextInt();
				
				//perhitungan
				System.out.println(nomorEmpat(x4, y4));
				statusExit = true;
                break;
                
			case 5:
				//deklarasi & inputan
				double x5;
				
				//inputan
				System.out.println("Masukan nilai x");
				x5 = input.nextInt();
				
				//perhitungan
				System.out.println(nomorLima(x5));
				statusExit = true;
                break;
			
			default :
				System.out.println("Eror");
                statusExit = true;
                break;
			}
		}
		while(!statusExit);	
	}
	public static double nomorSatu ( double x) 
	{
		double a;		
		a = Math.sqrt(Math.pow(x, 5)-6)/4;
		return(a);
	}
	
	public static double nomorDua(double x, double y) 
	{
		double b;
		b = Math.pow(x, y) - Math.pow(6, x);
		
		return b;
	}
	
	public static double nomorTiga(double z, double x)
	{
		double c;
		c = 4 *  Math.cos(z/5) - Math.sin(Math.pow(x, 2));
		return c;
	}
	
	public static double nomorEmpat(double x, double y) 
	{
		double d;
		d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));
		return d;
	}
	
	public static double nomorLima(double x)
	{
		double f;
		f = 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4)))));
		return f;
	}
}
