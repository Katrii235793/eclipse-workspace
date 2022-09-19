package java8;

import java.util.ArrayList;
import java.util.List;

public class sl {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(16);
		list.add(20);
		
		int sum=list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("The sum of numbers is : "+sum);
	}

}
