package ustdemo;

import java.util.Scanner;

public class pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, j, k, n;
		System.out.println("Enter value of n");
		n = scan.nextInt();
		k = n;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k - 1;
			}
			k = n;
			System.out.println();
		}
	}

}
