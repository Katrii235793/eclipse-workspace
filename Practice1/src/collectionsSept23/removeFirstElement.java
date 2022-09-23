package collectionsSept23;

import java.util.LinkedList;

public class removeFirstElement {

	public static void main(String[] args) {
LinkedList <String> list=new LinkedList<String>();
		
		
		list.add("Indore");
		list.add("is");
		list.add("beautiful");

		System.out.println(list);
		
		System.out.println(list.removeFirst()+" Removed");
		
		System.out.println("After updation>>>>>>>>>>>>>>>>");
		
		System.out.println(list);
		
	}

}
