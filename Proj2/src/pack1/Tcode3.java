package pack1;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Tcode3 {
public static void main(String[] args) {
   TreeSet<String> obj = new TreeSet<String>();
   

   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
   
  
   Set<String> reverseSet = obj.descendingSet();
   
   //get an iterator
   Iterator<String> itr = reverseSet.iterator();//Iterating in reverse order in descending way
   while (itr.hasNext()) 
   {
       System.out.println(itr.next());
   }
}
}
