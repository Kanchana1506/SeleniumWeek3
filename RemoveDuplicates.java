package week3.day2.assignment;

public class RemoveDuplicates {

	public static void main(String [] args)
	{
	//  Pseudo code 
	  //a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	
	  //b) Initialize an integer variable as count
		int count =1;
	
	  //c) Split the String into array and iterate over it
		String[] split = text.split(" ");
	
	for (int i =0; i< split.length;i++)
		{
			
	  //d) Initialize another loop to check whether the word is there in the array
		for(int j=i+1; j< split.length;j++)
		{
			if(split[i].equals(split[j]))
		 //e) if it is available then increase and count by 1.
		{	count++;
			//f) if the count > 1 then replace the word as ""
		if(count > 1)
			split[j]="";
		 	
		}
		}
		
	  //g)Displaying the String without duplicate words
		
	
	  //h) print the each word
		System.out.print(split[i]+ " ");	 



}
}
}