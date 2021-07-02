package compareEquals;

public class compareEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "ABC";
		String S2 = new String("DEF");
		String S3 = "AB" + "C";
		
		System.out.println(S1.compareTo(S2)); 
		System.out.println(S2.equals(S3));
		System.out.println(S3 == S1);
		System.out.println(S2.compareTo(S3));
		System.out.println(S3.equals(S1));
	}

}
