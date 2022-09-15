package ustdemo;

import java.util.Scanner;

public class pat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, j, n, c = 1;
		System.out.println("Enter the number");
		n = scan.nextInt();
		c = n - 1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= c; j++) {
				System.out.print(" ");

			}
			c--;
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}
		c = 1;
		for (i = 1; i <= n - 1; i++) {
			for (j = 1; j <= c; j++) {
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= 2 * (n - i) - 1; j++) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}

}
