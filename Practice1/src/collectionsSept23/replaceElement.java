package collectionsSept23;

import java.util.ArrayList;

public class replaceElement {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		System.out.println("The colors are : ");
		
		list.add("Black");
		list.add("Blue");
		list.add("Indigo");
		list.add("Green");
		list.add("Red");
System.out.println(list);
System.out.println("The updated list is ");
list.set(2,"Violet" );
//list.set(1, "White");
System.out.println(list);
	
	}

}
