package collectionsSept23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class joinLinkedlist {

	public static void main(String[] args) {
		LinkedList <String> list=new LinkedList<String>();
		LinkedList <String> list1=new LinkedList<String>();
		System.out.println("The first set of colors are : ");
		
		list.add("Black");
		list.add("Blue");
		list.add("Indigo");
		list.add("Green");
		
		System.out.println(list);		
			
		list1.add("Red");
		list1.add("Yellow");
		list1.add("Orange");
		list1.add("Pink");
		System.out.println("The second set of colors are : ");
		System.out.println(list);		
		
		LinkedList <String> a=new LinkedList<String>();
		a.addAll(list);
		a.addAll(list1);
		System.out.println("Updated List ");
		System.out.println(a);
	}

}
