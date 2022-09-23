package collectionsSept23;

import java.util.HashSet;
import java.util.TreeSet;

public class hashsetToTreeset {

	public static void main(String[] args) {

		HashSet <String> set=new HashSet<String>();
		System.out.println("Hashset>>The colors present in the list is : ");
		
		set.add("Black");
		set.add("Blue");
		set.add("Indigo");
		set.add("Green");
		set.add("Red");
		System.out.println(set);
		
		System.out.println("Treeset>>The colors present in the list is : ");
		
		TreeSet<String> treeset = new TreeSet<String>(set);
		System.out.println(treeset);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
