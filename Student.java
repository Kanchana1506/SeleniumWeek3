package week3.day1.assignment;

public class Student extends Department {

	public void studentName()
		{
		System.out.println("student name is test");
		}
	
	public void studentDept()
	{
		System.out.println("student department is computers");
	}
	
	public void studentId()
	{
		System.out.println("student id is 10001");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj = new Student();
obj.studentId();
obj.studentName();
obj.studentDept();
obj.deptName();
obj.colegeCode();
obj.collegeName();
obj.collegeRank();

	}

}
