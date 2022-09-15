package ustdemo;

import java.util.Scanner;

class Proj1 {
	public void printNum() {
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.println("Enter the value of i");
		i = scan.nextInt();
		System.out.println(i);

	}
}

class Proj2 extends Proj1 {
	@Override
	public void printNum() {
		Scanner scan = new Scanner(System.in);
		int j;
		System.out.println("Enter the value of j");
		j = scan.nextInt();
		System.out.println(j);

	}
}

public class projnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proj2 obj1 = new Proj2();
		Proj1 obj2 = new Proj1();
		obj1.printNum();
		obj2.printNum();

	}

}
