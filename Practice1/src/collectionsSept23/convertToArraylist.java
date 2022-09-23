package collectionsSept23;

import java.util.ArrayList;
import java.util.LinkedList;

public class convertToArraylist {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		System.out.println("The linkedlist is ");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		System.out.println("The  arraylist is ");
		ArrayList<Integer> array=new ArrayList<>(list);
		System.out.println(array);

	}

}
