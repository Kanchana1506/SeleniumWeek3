package week3.day2.assignment;

public class Palindrome {

	public static void main(String [] args)
	{
	//Build a logic to find the given string is palinDrome or not
    //  Pseudo Code
		
		  //a) Declare A String value as"madam"
		 String value ="madam";
		 System.out.println("String value is: " + value);
		 
		 int len = value.length();
		 System.out.println("String length is: " + len);
				 
		 //b) Declare another String rev value as ""
		 String rev="";
		 
		 
		 
		 //c) Iterate over the String in reverse order
		 for (int i= len-1 ;i >=0 ; i--)
		 {
			 //d) Add the char into rev
			 rev =rev + value.charAt(i);
			 
		 }
		 System.out.print("reverse string is: "+ rev);
		 System.out.println("");
		 
		 //e) Compare the original String with the reversed String, if it is same then print palinDrome
		 if(value.equals(rev))
			 System.out.println("palindrome");
		 else
			 System.out.println("not a palindrome");
		 
		  //Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 

	}
}
