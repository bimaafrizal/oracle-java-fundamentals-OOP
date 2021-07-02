package validasiEmail;
import java.util.*;
 
public class validasiEmail {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String inputEmail = "";
		String inputEmail2 = "@xxx.yyy";
		
		System.out.println("Masukan email (gunakan @xxx.yyy)");
		inputEmail = sc.next();
		
		System.out.println("");
		
		if (inputEmail.endsWith(inputEmail2)) {
			System.out.println("Email anda adalah " + inputEmail);

		} else {
			System.out.println("Email tidak valid");
		} 
	}
}
