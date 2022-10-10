package mockup;

import java.util.Scanner;

public class stringConcat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of inmate");
		String inmate=scan.nextLine();
		System.out.println("Enter the name of inmate dad");
		String dad=scan.nextLine();
		inmate=inmate.concat(" ");
		dad=dad.concat("  ");
		
		char[] ch=inmate.toCharArray();
		for(char e:ch)
		{
			if(Character.isDigit(e)) {
				System.out.println("Invalid entry");
				System.exit(0);
			}
		}
		
		System.out.println(inmate.concat(dad).toUpperCase());
	}

}
