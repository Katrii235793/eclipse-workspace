package ustdemo;

import java.util.Scanner;

public class arra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int a[];
		a = new int[10];
		System.out.println("Enter the numbers");
		for (i = 0; i < 10; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println("Enter the number");
		int n = scan.nextInt();
		int flag = 0;
		for (i = 0; i < 10; i++) {
			if (a[i] == n) {

				flag++;
				break;
			}
		}
		if (flag > 0)
			System.out.println("NUMBER FOUND");
		else {
			System.out.println("NOT FOUND");
		}
	}
}
