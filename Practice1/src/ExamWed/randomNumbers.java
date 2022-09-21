package ExamWed;
import java.util.*;
public class randomNumbers {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of random numbers that need to be generated");
		int num=scan.nextInt();
		System.out.println("The random numbers are: ");	
		for(int i=1;i<=num;i++) {	
			System.out.println(Math.random());
		}		
		
	}

}
