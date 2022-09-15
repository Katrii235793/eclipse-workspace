package ustdemo;

import java.util.Scanner;

public class arra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int a[];
		a = new int[5];
		System.out.println("Enter the numbers");
		for (i = 0; i < 5; i++) {
			a[i] = scan.nextInt();

		}
		int sum = 0, prod = 1;
		for (i = 0; i < 5; i++) {
			sum = sum + a[i];
			prod = prod + a[i];
		}
		System.out.println("The sum is= " + sum);
		System.out.println("The product is= " + prod);
	}
}
