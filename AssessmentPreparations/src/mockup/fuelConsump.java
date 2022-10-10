package mockup;

import java.util.*;

public class fuelConsump {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the qty of petrol");
		float lit=scan.nextInt();
		System.out.println("Enter the distance going to travel");
		float km=scan.nextInt();
	
		
		if(lit<=0 || km<=0) {
			System.out.println("The input is invalid");
		}
		else {
			float res=lit/km;
			System.out.println("Litres per km is ");
			System.out.printf("%.2f\n",res);
			float lit1=(float) (0.2642*lit);
			float km1=(float) (0.6214*km);
			float res1=lit1/km1;
			System.out.println("Miles per gallon is ");
			System.out.printf("%.2f\n",res1);
		}

	}

}
