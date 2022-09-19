package java8;//Using the ints() Method (in Java 8)
import java.util.Random;   
class randomNumbers {
    public static void main(String[] args) {
 
        Random random = new Random();
        random.ints(5,30,70).limit(5).forEach(System.out::println);
    }
}