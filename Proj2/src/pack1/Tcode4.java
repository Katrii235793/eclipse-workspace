package pack1;
//import java.util.Iterator;
import java.util.TreeSet;
public class Tcode4 {
public static void main(String[] args) {
   // create an empty linked list
   TreeSet<String> obj = new TreeSet<String>();
 // use add() method to add values in the linked list
   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
   String first=obj.first();
   String last=obj.last();
   System.out.print("The first element is "+first);
   System.out.print(" ,The last element is "+last);
}
}
   
   
   
