package world;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the word");
	    String word=scan.next();
	    String rvrs=" ";
	
	
		 for (int i=0; i<word.length(); i++)
	      {
	       char ch= word.charAt(i);
	        rvrs= ch+rvrs;
	        
	      }
		 for (int i=0; i<word.length(); i++) 
	if(word.charAt(i)==rvrs.charAt(i)) {
		System.out.println("Its palindrome");
		break;
	}
	else {
		System.out.println("Its not a palindrome");
	}
	}

}

