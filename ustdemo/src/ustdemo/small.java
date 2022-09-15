package ustdemo;

import java.util.Scanner;

public class small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int smallest, inter;
		System.out.println("Enter three numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		inter = a < b ? a : b;
		smallest = c < inter ? c : inter;
		System.out.println("The smallest number is=" + smallest);

	}

}
