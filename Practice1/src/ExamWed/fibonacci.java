package ExamWed;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number whose fibonacci is to be found");
		int num=scan.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		System.out.println("The factorial is "+fact);

	}

}
