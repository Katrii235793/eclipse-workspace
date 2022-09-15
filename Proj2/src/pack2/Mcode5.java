package pack2;
import java.util.HashMap;
public class Mcode5 {
public static void main(String[] args) {
   // create an empty linked list
	 HashMap<Integer,String> obj = new HashMap<Integer,String>();
	 obj.put(1, "Cat");
	 obj.put(2, "Dog");
	 obj.put(3, "Goat");
	 obj.put(4, "Cow");
	 System.out.println("Mappings are: " +obj);
	 System.out.println("Is the key '2' present? "
             + obj.containsKey(2));
	 /*containsKey() method is used to check whether a particular key is being mapped into the Map or not.
	  *  It takes the key element as a parameter and returns True if that element is mapped in the map.
	  */
	 System.out.println("Is the key '5' present? "
             + obj.containsKey(5));
}
}