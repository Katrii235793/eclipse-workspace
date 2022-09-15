package pack;
import java.util.LinkedList;
//import java.util.ArrayList;
public class Lcode6 {
public static void main(String[] args) {
   // create an empty linked list
   LinkedList<String> obj1 = new LinkedList<String>();
 // use add() method to add values in the linked list
        obj1.add("Monday");
        //obj1.add("Tuesday");
        obj1.add("Wednesday");
       // obj1.add("Thursday");
        obj1.add("Friday");
        obj1.add("Saturday");
        System.out.println("Linked list: "+obj1);
        obj1.addFirst("Tuesday");
        obj1.addLast("Thursday");
        
        System.out.println("Updated Linked list: "+obj1);

}
}
