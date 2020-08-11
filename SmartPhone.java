package week3.day1.classroom;

public class SmartPhone extends AndroidPhone
{

	
	public void connectWhatsapp()
	{
		System.out.println("Connecting to whatsapp via SmartPhone");
		
	}
	
	  public void takeVideo() 
	  { System.out.println("taking video via smart phone");
	  
	  }
	 

	
	public static void main(String[] args) {

SmartPhone obj = new SmartPhone();
obj.connectWhatsapp();
obj.takeVideo();
obj.sendMsg();
obj.makeCall();
obj.saveContact();

	}

}
