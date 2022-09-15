package pack1;
import java.util.PriorityQueue;
public class Tcode12 {
public static void main(String[] args) {
   // create an empty linked list
	PriorityQueue<String> obj = new PriorityQueue<String>();
   

   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
  
   System.out.print("The colors are : "+obj);
  String first= obj.peek();
  System.out.println();
  System.out.print("The first element is "+first);
  
}
}