package collectionsSept23;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class lessThanSpecifiedElement {

	public static void main(String[] args) {
		TreeSet <Integer> tree1=new TreeSet<>();
		
		
		tree1.add(5);
		tree1.add(10);
		tree1.add(15);
		tree1.add(20);
		tree1.add(25);
		tree1.add(30);
		tree1.add(35);
		tree1.add(40);
		tree1.add(45);
		tree1.add(50);
		System.out.println("The first treeset is :");
		System.out.println(tree1);
		
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet<Integer>)tree1.subSet(tree1.first(),num);   
		Iterator val = subset.iterator();
		while(val.hasNext())
				System.out.print(val.next()+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
