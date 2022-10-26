package oct26;

import java.util.Scanner;

public class Main {



	   public static void main(String[] args) {
	        UserBO user = new UserBO();
	        User u[] = user.getUser();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Username:");
	        String username = sc.next();
	        System.out.println("Password:");
	        String password = sc.next();
	        if(user.validate(username,password))
	            System.out.println("Login successful");
	        else
	            System.out.println("Incorrect username/password");
	    }



	}
