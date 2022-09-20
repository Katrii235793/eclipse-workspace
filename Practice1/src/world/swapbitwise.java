package world;

public class swapbitwise {

	public static void main(String[] args) {
		int i=7;
		int j=5;
		System.out.println("The numbers before swap i= "+i+",j= "+j);
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println("The numbers after swap i= "+i+",j= "+j);
		
		
		
		
	}

}
