package ustdemo;

import java.util.Scanner;

public class pat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, j, n;
		System.out.println("Enter the number");
		n = scan.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (i = n - 1; i > 0; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
