package world;
import java.io.*;
import java.util.*;
public class Survey {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the age");
	    int age=scan.nextInt();
	    System.out.println("Enter the sex:M/F");
	    String sex=scan.next();
	    System.out.println("Married:Y/N");
	    String mar=scan.next();
	    
	
if(sex=="F") {
	System.out.println("She works at urban area.");
}
else {
          if(age>20 && age<40)	{
	       System.out.println("He can work anywhere");
}
          else if(age>40 && age<60) {
	      System.out.println("He can work at urban areas only");
}

           else {
	       System.out.println("ERROR"); 
}
	
	
	}	
}	
}
