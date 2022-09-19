package java8;
import java.util.stream.*;  
public class stream {  
     
    public static void main(String[] args){  
        Stream.iterate(5, count->count+1) 
        .filter(number->number%2==0)  
        .limit(5)  
        .forEach(System.out::println);
    }  
}