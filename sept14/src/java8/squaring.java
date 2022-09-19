package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class squaring {

	public static void main(String[] args) {
	    Integer[] arr = new Integer[] { 100, 100, 900, 8, 200 };
	
		List <Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(arr);
		OptionalDouble avg = list.stream().mapToInt(n->n * n).filter(n -> n > 100).average();
		if (avg.isPresent())
            System.out.println(avg.getAsDouble());
		/*else {
			System.out.println("Element Not present ");*/
		}
    }
