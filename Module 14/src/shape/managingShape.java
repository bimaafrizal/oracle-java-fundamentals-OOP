package shape;

public class managingShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle r1 = new rectangle(8, 5);
		System.out.println(r1.hitungLuas());
		
		triangle t1 = new triangle(8, 5);
		System.out.println(t1.hitungLuas());
		
		circle c1 = new circle(7);
		System.out.println(c1.hitungLuas());
		
		square s1 = new square(7, 7);
		System.out.println(s1.hitungLuas());
	}
}
