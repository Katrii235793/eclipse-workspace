package collectionsSept23;

import java.util.PriorityQueue;
public class iteratePQ {
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();  
  pq.add("Red");
  pq.add("Green");
  pq.add("Orange");
  pq.add("White");
  pq.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  
  for (String color : pq) {
    System.out.println(color);
    }
 }
}
 