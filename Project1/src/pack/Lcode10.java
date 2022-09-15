package pack;
import java.util.LinkedList;
//import java.util.ArrayList;
public class Lcode10 {
public static void main(String[] args) {
   // create an empty linked list
   LinkedList<String> obj1 = new LinkedList<String>();
 // use add() method to add values in the linked list
        obj1.add("Monday");
        obj1.add("Tuesday");
        obj1.add("Wednesday");
        obj1.add("Thursday");
        obj1.add("Monday");
        obj1.add("Saturday");
        int first=obj1.indexOf("Monday");
        int last=obj1.lastIndexOf("Monday");
        System.out.println("The linked list: " +obj1);
        System.out.println("The first location is = "+ first);
        System.out.println("The last location is = "+ last);
        }
	
 // print the list

      
}