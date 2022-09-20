package world;

import java.util.Scanner;

public class natural {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the Limit");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Natural Number: "+sum);
	}

}
