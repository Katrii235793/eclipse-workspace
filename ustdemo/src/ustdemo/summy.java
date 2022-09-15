package ustdemo;

import java.util.Scanner;

public class summy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[];
		int sumev = 0;
		int sumodd = 0;
		a = new int[10];
		System.out.print("Enter the 10-digit number as an array");

		for (int i = 0; i < 10; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				sumev = sumev + a[i];

			} else {
				sumodd = sumodd + a[i];
			}
		}
		System.out.println("Sum of even digits=" + sumev);
		System.out.println("Sum of odd digits=" + sumodd);

	}
}
