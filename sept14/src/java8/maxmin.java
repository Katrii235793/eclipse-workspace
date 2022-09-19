package java8;
import java.util.Comparator;
import java.util.stream.*;
 
public class maxmin{
   public static void main(String args[]) {
         
    Integer highest = Stream.of(11,35,70,56,21,2,10) 
                        .max(Comparator.comparing(Integer::valueOf))
                        .get();
     
         
    Integer lowest = Stream.of(11,35,70,56,21,2,10) 
                        .min(Comparator.comparing(Integer::valueOf))
                        .get();
     
   
    System.out.println("The highest number is: " + highest);
    System.out.println("The lowest number is: " + lowest);
   }
}