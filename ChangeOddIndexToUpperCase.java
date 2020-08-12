package week3.day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main (String [] args)
	{
	 //Pseudo Code
	 
	 //* Declare String Input as Follow
	   String test = "changeme";
	 
	 //* a) Convert the String to character array
	 char [] arr = test.toCharArray();
	
	 //* b) Traverse through each character (using loop)
	 for (int i=0; i< arr.length; i++)
	 {
	 char c =arr[i];
	 
	 //* c)find the odd index within the loop (use mod operator)
	 if(i % 2 != 0)
		 
	 //* d)within the loop, change the character to uppercase, if the index is odd else don't change
	 c = Character.toUpperCase(c);
	 System.out.print(c);
	 
	 
	 }
}
}
