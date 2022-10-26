package oct26;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserBO {
	 User[] u=new User[5];
	
		 public User[] getUser()
		    {
		        u[0] = new User(1,"Louis",encryptPassword("rxfsuzA2345"));
		        u[1] = new User(2,"Messie",encryptPassword("hpphmf1:"));
		        u[2] = new User(3,"Steve",encryptPassword("openfKt"));
		        u[3] = new User(4,"kallis",encryptPassword("23456778"));
		        u[4] = new User(5,"Wipro",encryptPassword("A$%"));
		        return u;
		
		
	}

	private String encryptPassword(String Password) {
		String encrypt="";
		for(int i=0;i<Password.length();i++) {
			int ascii=(int)Password.charAt(i);
			encrypt+=(char)(ascii+1);
		}
		
		 
		return encrypt;
		
		}
	boolean validate(String username,String password)
    {
	
		 for(int i=0;i<u.length;i++) 
	            if(u[i].getUsername().equals(username) && u[i].getPassword().equals(encryptPassword(password)))
	                return true;
	        return false;        
	            
	 }
}
		
		
		
		
    
	
	
	
	
	
	
	

