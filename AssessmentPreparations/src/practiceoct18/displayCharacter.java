package practiceoct18;


import java.util.Scanner;

public class displayCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a[]= new int[4];
		System.out.println("enter any 4 digits");
		for(int i=0;i<4;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<4;i++) {
			char c=(char) a[i];
			System.out.println(a[i]+"-"+c);
		}
	}

}
