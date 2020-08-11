package week3.day1.classroom;

public class Calculator {

	public int addition(int num1, int num2)
	{
		int sum=num1+num2;
		return sum;
		
	}
	
	public int addition(int num1, int num2,int num3)
	{
		int sum=num1+num2+num3;
		return sum;
		
	}
	
	public int multiple(int num1, int num2)
	{
		int result = num1 * num2;
		return result;
	}
	
	public double multiple(int num1, double num2)
	{
		double result = num1 * num2;
		return result;
	}
	
	public int substract(int num1, int num2)
	{
		int result = num1 - num2;
		return result;
	}
	
	public double substract(double num1, double num2)
	{
		double result = num1 - num2;
		return result;
	}
	
	public int divide(int num1, int num2)
	{
		int result = num1 / num2;
		return result;
			}
	
	public double divide(int num1, double num2)
	{
		double result = num1 / num2;
		return result;
			}
	
	public static void main(String[] args) {
		
		Calculator obj= new Calculator();
		System.out.println("addition of two integer: " +obj.addition(10, 15));
		System.out.println("addition of three integer: " +obj.addition(5, 6, 1));
		System.out.println("multiplication of two integer: " +obj.multiple(6, 4));
		System.out.println("multiplication of integer and double: " +obj.multiple(4, 6.45));
		System.out.println("substraction of two integer: " +obj.substract(6, 3));
		System.out.println("substraction of two double: " +obj.substract(5.4, 1.1));
		System.out.println("division of two integer: " +obj.divide(6, 2));
		System.out.println("division of integer and double: " +obj.divide(8, 2.2));
		

	}

}
