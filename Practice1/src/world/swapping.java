package world;
public class swapping {

    public static void main(String[] args) {



     int x = 1;
      int y = 2;



     System.out.println("Before Swapping");
      System.out.println("Value of x is :" + x);
      System.out.println("Value of y is :" + y);



   
      x = x + y;
      y = x - y;
      x = x - y;



     System.out.println("after Swapping");
      System.out.println("Value of x is :" + x);
      System.out.println("Value of y is :" + y);
     }
    }