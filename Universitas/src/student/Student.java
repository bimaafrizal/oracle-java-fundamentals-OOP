package student;

public class Student {
	private int studentID;
	private String name;
	private String NIM;
	private int IPK;
	
	public Student(int studentID, String name, String NIM, int IPK)
	{
		this.studentID = studentID;
		this.name = name;
		this.NIM = NIM;
		this.IPK = IPK;
	}
	
	public void setStudentId(int newStudentId)
	{
		studentID = newStudentId;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setNIM(String newNIM)
	{
		NIM = newNIM;
	}
	public void setIPK(int newIPK)
	{
		IPK = newIPK;
	}
	public int getStudentID()
	{
		return studentID;
	}
	public String getName()
	{
		return name;
	}
	public String getNIM()
	{
		return NIM;
	}
	public int getIPK()
	{
		return IPK;
	}
}
