package collectionsSept23;

import java.util.Collections;
import java.util.LinkedList;

public class shuffle {

	public static void main(String[] args) {
		LinkedList <String> list=new LinkedList<String>();
		
		System.out.println("The colors are : ");
		
		list.add("Black");
		list.add("Blue");
		list.add("Indigo");
		list.add("Green");
		
		System.out.println(list);		
			
			
		
		Collections.shuffle(list);
		System.out.println("The shuffled list is ");
		System.out.println(list);

	}

}
