package collectionsSept23;

import java.util.Arrays;
import java.util.HashSet;

public class convertSetToArray {

	public static void main(String[] args) {
		HashSet <String> set=new HashSet<String>();
		System.out.println("HashSet>>The colors present in the list is : ");
		
		set.add("Black");
		set.add("Blue");
		set.add("Indigo");
		set.add("Green");
		set.add("Red");
		System.out.println(set);

       String [] array=new String[set.size()];
       set.toArray(array);
       System.out.println("Array>>The colors present in the list is : ");
       System.out.println(Arrays.toString(array));

	

	}

}
