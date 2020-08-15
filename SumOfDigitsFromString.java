package week3.day2.assignment;

public class SumOfDigitsFromString {
	public static void main(String [] args)
	{
	
	//  Method 1
	  //Pseudo Code
	 //Declare a String text with the following value  
	//Declare a int variable sum
	//a) using replaceAll(), replace all the non-digits into ""
	//b) Now, convert the String into array
	//c) Iterate over the array and get each character
    //e) Add the values to sum & print
	

	//  Method 2
	 // Pseudo Code
	  //Declare a String text with the following value
				String text = "Tes12Le79af65";
				
				
	   //Declare a int variable sum
				int sum = 0;
				
	  //a) Iterate an  array over the String
				for(int i=0; i< text.length(); i++)
				
	//b) Get each character and check if it is a number using Character.isDigit()
							{
					if (Character.isDigit(text.charAt(i)))
					{
						//c) Now covert char to int using Character.getNumericValue() and add it to sum
						sum = sum + Character.getNumericValue(text.charAt(i));
						
					}
						
					
				}		
	  //d) Now Print the value
	 System.out.println("sum of digits:" + sum);

}

}