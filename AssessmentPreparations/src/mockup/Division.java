package mockup;

import java.util.Scanner;

public class Division{
	@SuppressWarnings("finally")
	public String divideTwoNumbers(int number1,int number2) {
		double res=0;
		String print=" ";
		try {
			res=number1/number2;
			print=("The answer is "+res);
		}
		
		catch(ArithmeticException e)
		{
		print="Division by zero is not possible";	
		}
		 finally
	        {
	            return(print+". Thanks for using the application.");    
	        }
	    }

	public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 =  scan.nextInt();
        System.out.println("Enter the second number");
        int num2 =  scan.nextInt();
        Division div = new Division();
        System.out.print(div.divideTwoNumbers(num1,num2));
    }
}