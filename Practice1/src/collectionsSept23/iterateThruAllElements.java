package collectionsSept23;

import java.util.ArrayList;

import java.util.ListIterator;

public class iterateThruAllElements {

	public static void main(String[] args) {
		
		ArrayList <String> list=new ArrayList<String>();
		System.out.println("The colors are : ");
		
		list.add("Black");
		list.add("Blue");
		list.add("Indigo");
		list.add("Green");
		list.add("Red");
		
		ListIterator<String> iterate= list.listIterator();
		System.out.println("Iterating over ArrayList ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			
			
		}
		

	}

}
