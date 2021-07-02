package exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;        
		String greeting[]={"satu", "dua","tiga"};        
		
		try {
			while(i<4){            
				System.out.println(greeting[i]);            
				i++;        
			} 
		}
		catch(Exception e) {
			System.out.println("System Eror");
		}
	} 
}



