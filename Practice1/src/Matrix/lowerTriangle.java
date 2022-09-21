package Matrix;
import java.util.*;
public class lowerTriangle {

	public static void main(String[] args) {
		
		
		int p,q;
		Scanner scan=new Scanner (System.in);	
		System.out.print("Enter the number of rows in the matrix:");
	    p = scan.nextInt();
	    System.out.print("Enter the number of coloumn in the matrix:");
	    q = scan.nextInt();	
	    int a[][] = new int[p][q];
	    
	    System.out.println("Enter elements of matrix");
	    for(int i=0;i<p;i++) {
	    	for(int j=0;j<q;j++) {
	    	a[i][j]=scan.nextInt();
	    	}
	    }

		
		int i;
		while(j<=i) {
			
		

		for( i=0;i<4;i++) {
			for( j=0;j<4;j++) {
				
				
				System.out.print(a[i][j]);
				System.out.println();
			}
		}
		
		}
		
		System.out.println(" ");
		
		
		
	}

}
