package student;

public class ManagingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(01, "Bima", "V3420018", 4);

		System.out.println("ID " + s1.getStudentID());
		System.out.println("Nama " + s1.getName());
		System.out.println("NIM " + s1.getNIM());
		System.out.println("IPK " + s1.getIPK());
	}

}
