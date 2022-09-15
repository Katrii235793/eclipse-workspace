package ustdemo;

import java.util.Scanner;

public class primefact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num, c;
		System.out.println("Enter a number");
		num = scan.nextInt();
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
			}
		}
		if (num > 2) {

			System.out.print("Prime factor is" + num);
		}
	}

}
