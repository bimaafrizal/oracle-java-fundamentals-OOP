package anagram;

import java.util.*;

public class anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text1;
		String text2;
		
		System.out.println("Masukan kata pertama");
		text1 = scan.next();
		System.out.println("Masukan kata kedua");
		text2 = scan.next();
		
		//cek panjang
		if(text1.length() == text2.length()) {
			//convert to array and make lower all letter
			char [] tes1 = text1.toLowerCase().toCharArray();
			char [] tes2 = text2.toLowerCase().toCharArray();							
			
			//sort
			Arrays.sort(tes1);
			Arrays.sort(tes2);
			
			if(Arrays.equals(tes1, tes2)) {
				System.out.println("Termasuk Anagram");
			}
			else {
				System.out.println("Bukan termasuk Anagram");
			}
		}
		else {
			System.out.println("Bukan termasuk Anagram");
		}
	}

}
