package practiceoct18;

import java.util.Arrays;
import java.util.Scanner;

public class Pair {

	public static void main(String[] args) {
		int count=0,i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l=scan.nextInt();
		int[] a=new int[l];
		
		System.out.println("Enter the array elements ");
		for(i=0;i<a.length;i++) 
		{
			a[i]=scan.nextInt();
		}
			
		
		System.out.print("Displaying the array ");
		for(i=0;i<a.length;i++) 
		{
		System.out.print(a[i]+" "+" ");
		}
		System.out.println();
		
		System.out.println("Enter the desired sum");
		int k=scan.nextInt();
				count++;
				Arrays.sort(a);
		        for( i=0;i<a.length;i++)
		        {
		            for(int j=i+1;j<a.length-1;j++)
		            {
		                if(a[i]==a[j])
		                    a[i]=a[j+1];
		            }
		        }
		
			System.out.println("The number of pairs "+count);
				}
	}


