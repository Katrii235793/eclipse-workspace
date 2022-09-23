package collectionsSept23;

import java.util.HashSet;

public class compareAndRetain {

	public static void main(String[] args) {
		HashSet <String> set=new HashSet<>();
		
		System.out.println("The first set of colors are ");
		
		set.add("Black");
		set.add("Blue");
		set.add("Indigo");
		set.add("Green");
		set.add("Red");
		
		System.out.println(set);
		
HashSet <String> set2=new HashSet<>();
		
		System.out.println("The second set of colors are ");
		
		set2.add("Black");
		set2.add("Sheep");
		set2.add("of");
		set2.add("Green");
		set2.add("Valley");
		
		System.out.println(set2);
		set.retainAll(set2);
		
		System.out.println("The common words are "+set);
		
		
	}

}
