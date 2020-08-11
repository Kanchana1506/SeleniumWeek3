package week3.day1.assignment;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("method with one argument");
			System.out.println("student id is: " + id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("method with two argument");
		System.out.println("student id is: " + id);
		System.out.println("student name is: " + name);
	}
	
	public void getStudentInfo(String email, long phone)
	{
		System.out.println("method with two argument");
		System.out.println("email is: " + email);
		System.out.println("phone is: " + phone);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students obj = new Students();
		obj.getStudentInfo(100);
		obj.getStudentInfo(101, "Harry Potter");
		obj.getStudentInfo("harryP@gmail.com",1523141210L);
	}

}
