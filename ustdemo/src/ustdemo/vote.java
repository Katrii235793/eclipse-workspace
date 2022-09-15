package ustdemo;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age ");
		age = scan.nextInt();
		if (age > 17) {
			System.out.println("You are eligible");
		} else {
			System.out.println("You are not eligible");
		}
	}

}
