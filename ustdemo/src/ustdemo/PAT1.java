package ustdemo;

import java.util.Scanner;

public class PAT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("Enter value of n");
		int n = scan.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println(" ");
		}
	}

}
