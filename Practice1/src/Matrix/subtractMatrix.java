package Matrix;
import java.util.*;
public class subtractMatrix {

	public static void main(String[] args) {
	int p,q,m,n;
	Scanner scan=new Scanner (System.in);	
	System.out.print("Enter the number of rows in the first matrix:");
    p = scan.nextInt();
    System.out.print("Enter the number of coloumn in the first matrix:");
    q = scan.nextInt();	
    System.out.print("Enter the number of rows in the second matrix:");
    m = scan.nextInt();	
    System.out.print("Enter the number of coloumn in the second matrix:");
    n = scan.nextInt();
	
    int a[][] = new int[p][q];   
    int b[][] = new int[m][n];   
    int c[][] = new int[m][n]; 
    
    System.out.println("Enter elements of first matrix");
    for(int i=0;i<p;i++) {
    	for(int j=0;j<q;j++) {
    	a[i][j]=scan.nextInt();
    	}
    }
		
    System.out.println("Enter elements of second matrix");
    for(int i=0;i<m;i++) {
    	for(int j=0;j<n;j++) {
    	b[i][j]=scan.nextInt();
    	}
    }
		
    for(int i=0;i<m;i++) {
    	for(int j=0;j<n;j++) {
    		for(int k=0;k<n;k++) {
    			c[i][j]=a[i][j]-b[i][j];
    		}
    	}
    }
    			
    			
    			
    			
    			
    			
    			
    			System.out.println("Matrix after subtraction:");
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    System.out.print(c[i][j]+" ");
	                }
	                System.out.println("");
	            }
    			
		
    }
		
}	
		
		
		
		
		
		
		
		
		
		
    
		
	


