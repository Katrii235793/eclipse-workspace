package pack2;
import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.Set;
public class Mcode10 {
public static void main(String[] args) {
   // create an empty linked list
	 HashMap<Integer,String> obj = new HashMap<Integer,String>();
	 obj.put(1, "Cat");
	 obj.put(2, "Dog");
	 obj.put(3, "Goat");
	 obj.put(4, "Cow");
	 System.out.println("Mappings are: " +obj);
	
	 System.out.println("Mappings are: " + obj.get(3));
}
}