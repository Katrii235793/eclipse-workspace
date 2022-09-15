package pack;
import java.util.LinkedList;
import java.util.ListIterator;
public class Lcode3 {
public static void main(String[] args) {
   // create an empty linked list
   LinkedList<String> obj3 = new LinkedList<String>();
 // use add() method to add values in the linked list
        obj3.add("Monday");
        obj3.add("Tuesday");
        obj3.add("Wednesday");
        obj3.add("Thursday");
        obj3.add("Friday");
        obj3.add("Saturday");
        ListIterator itr = obj3.listIterator(2);

        System.out.println("Leave Days applied in a week:");
        while (itr.hasNext()) {
          System.out.print(itr.next() + ",");
        }
      }
    }
      /*In the main() method, we created an object of the LinkedList 
       * collection class to store country names.
         And, added country names using add() method. 
      Then we iterated the list items using ListIterator class and 
      its method from index 2 and printed the result.  
       */