package java8;

import java.util.ArrayList;
import java.util.List;

public class strlist {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Katrii");
		list.add("Ana");
		list.add("Tony");
		list.add("Crimson");
		
	double count=list.stream().filter(str->str.length()>4).count();
		System.out.println("Number of strings having length greater than 4 is "+count);
	}
}