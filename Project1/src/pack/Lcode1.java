package pack;
import java.util.LinkedList;
import java.util.ArrayList;
public class Lcode1 {
public static void main(String[] args) {
   // create an empty linked list
   LinkedList<String> obj1 = new LinkedList<String>();
 // use add() method to add values in the linked list
        obj1.add("Monday");
        obj1.add("Tuesday");
        obj1.add("Wednesday");
        obj1.add("Thursday");
        obj1.add("Friday");
        obj1.add("Saturday");
        
	
 // print the list

        System.out.println("The linked list: " +obj1);
}
}
//Note for me:Each of these data gets added one by one.
//At first Mon gets added.
//At the end of that step Tues gets added and so on.