package pack1;
import java.util.HashSet;
public class Tcode7 {
public static void main(String[] args) {
   // create an empty linked list
   HashSet<String> obj = new HashSet<String>();
   

   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
   System.out.print("The colors are : "+obj);
   HashSet<String> copy= new HashSet<String>();//Create a new cloned set
   copy=(HashSet)obj.clone();
   System.out.println();
   System.out.print("The copy of colors are : "+obj);
   
}
}
