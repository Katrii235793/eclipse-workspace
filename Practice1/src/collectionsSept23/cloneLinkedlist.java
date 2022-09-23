package collectionsSept23;

import java.util.LinkedList;

public class cloneLinkedlist {

	public static void main(String[] args) {
		
LinkedList <String> list=new LinkedList<String>();
		
		System.out.println("The colors are : ");
		
		list.add("Black");
		list.add("Blue");
		list.add("Indigo");
		list.add("Green");
		
		System.out.println(list);
		 LinkedList <String> newlist = new LinkedList <String> ();
         newlist = (LinkedList<String>) list.clone();
   System.out.println("Cloned linked list: " + newlist);   
		
		
		
		
		 

	}

}
