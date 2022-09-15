package pack1;
import java.util.HashSet;
//import java.util.Set;
public class Tcode8 {
public static void main(String[] args) {
   // create an empty linked list
   HashSet<String> obj = new HashSet<String>();
   

   obj.add("Black");
   obj.add("Blue");
   obj.add("Brown");
   obj.add("Green");
   obj.add("Red");
   System.out.print("The first set colors are : "+obj);
   HashSet<String> obj1= new HashSet<String>();
   obj1.add("Blue");
   obj1.add("Orange");
   obj1.add("Green");
   obj1.add("Yellow");
   System.out.println();
   System.out.print("The second set colors are : "+obj1);
   //Set<String> set=new HashSet(obj);//storing set 1 to the new object set
   obj.retainAll(obj1);//retaining common elements of set 1 & set2
   System.out.println();
   System.out.println("The common elements of set 1 & set 2 "+obj);
}
}
   
   
   