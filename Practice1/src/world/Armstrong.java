package world;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);
	int sum=0;
				System.out.println("Enter the number");
				int n=scan.nextInt();
				int num=n;
				while(num!=0)
				{
				int r=num%10;
				
				sum=sum+(r*r*r);
				num=num/10;	
			    }
				if(sum==n)
				{
					System.out.println("Armstrong");
				}
				else
				{
					System.out.println("not Armstrong");
				
				}
}
}
