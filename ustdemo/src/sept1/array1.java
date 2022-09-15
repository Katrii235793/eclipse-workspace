package sept1;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
				int i=0;
		int a[];
		a=new int[10];
		System.out.println("Enter the numbers");
		for(i=0;i<10;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("The numbers are");
		for(i=0;i<10;i++) {
			System.out.println(a[i]);
	}

}
}