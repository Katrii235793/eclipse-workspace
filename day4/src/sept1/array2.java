package sept1;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0;
int a[];
a=new int[10];
System.out.println("Enter the numbers");
for(i=0;i<10;i++) {
	a[i]=scan.nextInt();
	}

System.out.println("Enter the number");
int n=scan.nextInt();
for(i=0;i<10;i++) {
	if(a[i]==n) {
		System.out.println("NUMBER FOUND");
	}
	else {
		System.out.println("NOT FOUND");
	}
}
}
}
