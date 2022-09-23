package collectionsSept23;

import java.util.ArrayList;
import java.util.Collections;

public class sortCollections {

	public static void main(String[] args) {
		
				ArrayList <String> list=new ArrayList<String>();
				System.out.println("The colors are : ");
				list.add("Indigo");
				list.add("Black");
				list.add("Red");
				list.add("Green");
				list.add("Blue");
				
		System.out.println(list);
		System.out.println("The sorted list is ");
		Collections.sort(list);
		System.out.println(list);

}
}