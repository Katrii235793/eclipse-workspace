package practiceoct18;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter your ID");
	String id=scan.nextLine();//GBL/020/0715
	int len=id.length();
	if(len==12) {
		String a=id.substring(0,3);
		String sym1=id.substring(3,4);
		String b=id.substring(4,7);
		String sym2=id.substring(7,8);
		String c=id.substring(8,11);
		if("GBL".equals(a)&& "/".equals(sym1) && "020".equals(b) && "/".equals(sym2) ){//&& "0715".equals(c) ) {
			try {
				int try1=Integer.parseInt(b);
				System.out.println("Login Success");
			}catch(Exception e) {
				System.out.println("Incorrect Format");
			}
		}	
	
	else 
		System.out.println("Incorrect format");
	}
	else 
		System.out.println("Invalid input");
}
}
		
		
	


