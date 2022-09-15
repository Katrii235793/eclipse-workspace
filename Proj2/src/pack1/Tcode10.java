package pack1;
import java.util.PriorityQueue;
//import java.util.TreeSet;
public class Tcode10 {
public static void main(String[] args) {
   // create an empty linked list
	PriorityQueue<String> obj = new PriorityQueue<String>();

   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
   int count=obj.size();
  
   System.out.print("The total number of elements are : "+count);
}
}