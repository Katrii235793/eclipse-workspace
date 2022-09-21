package ExamWed;
import java.util.*;
public class primeNumbers {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num=scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int c=0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					c++;
					break;

				}
			}
			if (c == 0) {
				System.out.print(i + " ");

	}

}
	}
}
