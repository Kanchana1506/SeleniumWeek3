package week3.day2.classroom;

public class College extends University {

	public void ug() {
	System.out.println("ug course defined in college class - unimplemented method");
		
	}

	
	public static void main(String[] args) {
		College obj = new College();
		obj.pg();
		obj.ug();

	}

	
	
}
