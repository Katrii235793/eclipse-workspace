package pack1;
import java.util.HashSet;
public class Tcode6 {
public static void main(String[] args) {
   // create an empty linked list
	 HashSet<String> obj = new HashSet<String>();
   

   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
  
   System.out.print("The colors are : "+obj);
}
}
/*each element gets appended to the back of previous element */