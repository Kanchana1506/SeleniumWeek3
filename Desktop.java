package week3.day1.assignment;

public class Desktop extends Computer {

	public void desktopsize()
	{
		System.out.println("desktop size is 1200px");
	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopsize();

	}

}
