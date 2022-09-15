package ustdemo;

import java.util.Scanner;

public class arra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int a[], b[];
		a = new int[5];
		b = new int[5];
		System.out.println("Enter the numbers");
		for (i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			if (a[i] > b[i])
				System.out.println("Largest number is =" + a[i]);
			else
				System.out.println("Largest number is =" + b[i]);
		}

	}
}