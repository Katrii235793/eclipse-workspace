package ustdemo;

import java.util.Scanner;

public class Pat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, j, n;
		System.out.println("Enter value of n");
		n = scan.nextInt();
		for (i = 1; i < n; i++) {
			for (j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}
			System.out.println();
		}

	}

}
