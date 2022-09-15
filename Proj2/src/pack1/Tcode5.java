package pack1;
import java.util.*;
public class Tcode5 {
public static void main(String[] args) {
   // create an empty linked list
   TreeSet<Integer> obj = new TreeSet<Integer>();
 // use add() method to add values in the linked list
   obj.add(1);
   obj.add(2);
   obj.add(3);
   obj.add(4);
   obj.add(5);
   obj.add(6);
   obj.add(7);
   obj.add(8);
   obj.add(9);
   obj.add(10);
   SortedSet<Integer> below7=obj.headSet(7);
   //A Set that further provides a total ordering on its elements.
   //The elements are ordered using their natural ordering
   System.out.println("The numbers below 7 are "+below7);
}
}