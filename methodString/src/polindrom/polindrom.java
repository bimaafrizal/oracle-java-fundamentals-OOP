package polindrom;

import java.util.*;

public class polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String inputText;
		int textLength;
		String reverse = "";
		
		System.out.println("Masukan Text");
		inputText = sc.nextLine();
		textLength = inputText.length();
		
		System.out.println(" ");
		
		for(int i = textLength - 1; i >= 0; i--) {
			reverse = reverse + inputText.charAt(i);
		}
		
		if (inputText.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("Termasuk Polindrom");
		}
		else {
			System.out.println("Bukan termasuk polindrom");
		}
		
	}
}
