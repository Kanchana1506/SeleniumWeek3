package week3.day2.classroom;

public class Desktop implements HardWare, Software {

	public void softwareResources() {
		System.out.println("software resources from software interface");
		
	}

	public void hardwareResoures() {
		System.out.println("hardware resources from hardware interface");
		
	}
	
	public void desktopModel()
	{
		System.out.println("desktop model from desktop class");
	}
	
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.softwareResources();
		obj.hardwareResoures();
		obj.desktopModel();

	}

	

}
