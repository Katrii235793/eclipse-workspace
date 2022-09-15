package pack1;
import java.util.ArrayList;
import java.util.ListIterator;
public class Exarrlist {
public static void main(String[] args) {
   // create an empty linked list
   ArrayList<String> obj3 = new ArrayList<String>();
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
