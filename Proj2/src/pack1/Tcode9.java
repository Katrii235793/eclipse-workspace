package pack1;
import java.util.PriorityQueue;
public class Tcode9 {
public static void main(String[] args) {
   // create an empty linked list
	PriorityQueue<String> obj = new PriorityQueue<String>();
  
   obj.add("Black");
   PriorityQueue<Integer> obj1 = new PriorityQueue<Integer>();
   obj1.add(16);
  
   System.out.print("The colors is : "+obj);
   System.out.println();
   System.out.print("The number is : "+obj1);
   
}
}
