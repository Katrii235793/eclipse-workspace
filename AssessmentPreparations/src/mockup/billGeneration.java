package mockup;

import java.util.*;

public class billGeneration {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no: of pizzas");
		int pizza=scan.nextInt();
		System.out.println("Enter the no: of puffs");
		int puffs=scan.nextInt();
		System.out.println("Enter the no: of cool drinks");
		int drink=scan.nextInt();
		float costpiz=100*pizza;
		float costpuff=20*puffs;
		float costdrink=10*drink;
		float total=costpiz+costpuff+costdrink;
		
		System.out.println("The bill details are ");
		System.out.println("The no: of pizzas: "+pizza);
		System.out.println("The no: of puffs: "+puffs);
		System.out.println("The no: of cool drinks: "+drink);
		System.out.println("Total Price: "+total);
		System.out.println("ENJOY THE SHOW!");
		
		
	}

}
