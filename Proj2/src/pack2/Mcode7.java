package pack2;
import java.util.HashMap;
public class Mcode7 {
public static void main(String[] args) {
   // create an empty linked list
	 HashMap<Integer,String> obj = new HashMap<Integer,String>();
	 obj.put(1, "Cat");
	 obj.put(2, "Dog");
	 obj.put(3, "Goat");
	 obj.put(4, "Cow");
	 System.out.println("Mappings are: " +obj);
	 System.out.println("Is the value '10' present? " + obj.containsKey(10));
	
	 System.out.println("Is the value '1' present? " + obj.containsKey(1));
	  }
}
