package ustdemo;

import java.util.Scanner;

public class arra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 0, j = 0;
		int a[][] = new int[2][2];
		System.out.println("Enter the numbers");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}