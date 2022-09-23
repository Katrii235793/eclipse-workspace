package collectionsSept23;

import java.util.ArrayList;

public class compareArrayList {

	public static void main(String[] args) {
		ArrayList <String> list1=new ArrayList<String>();
		ArrayList <String> list2=new ArrayList<String>();
		System.out.println("The first list is : ");
		list1.add("Indigo");
		list1.add("Black");
		list1.add("Red");
		list1.add("Green");
		list1.add("Blue");
		System.out.println(list1);
		
		System.out.println("The second list is : ");
		list2.add("Indigo");
		list2.add("Black");
		list2.add("Red");
		list2.add("Green");
		list2.add("Blue");
		System.out.println(list2);
		
		boolean val=list1.equals(list2);
		System.out.println("The fact that both lists are equal is "+val);
		list2.set(0, "White");
		System.out.println("The new list 2 is : ");
		System.out.println(list2);
		System.out.println("Comparing the lists again........................");
		boolean val1=list1.equals(list2);
		System.out.println("The fact that both lists are equal is "+val1);	

	}

}
