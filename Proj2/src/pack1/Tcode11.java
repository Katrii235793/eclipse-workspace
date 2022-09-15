package pack1;
import java.util.PriorityQueue;
//import java.util.TreeSet;
public class Tcode11 {
public static void main(String[] args) {
   // create an empty linked list
	PriorityQueue<String> obj = new PriorityQueue<String>();
int c=0;
   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   //obj.add("Red");
   PriorityQueue<String> obj1 = new PriorityQueue<String>(); 
   obj1.add("Violet");
   obj1.add("Orange");
   obj1.add("Gold");
   obj1.add("Yellow");
  // System.out.println();
   //System.out.print("The second set colors are : "+obj1);
  /*if( obj.equals(obj1))
		  System.out.println("They are equal");
  else
	  System.out.println("They are equal");*/
   for(String c1:obj) {
	   for(String c2:obj1) {
		   if(c1==c2) {
			   c++;
			   //break;
		   }
	   }

   }
}
}