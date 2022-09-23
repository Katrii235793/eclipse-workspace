package collectionsSept23;

import java.util.Collections;
import java.util.LinkedList;

public class swapElements {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		
		System.out.println(list);

	}

}
