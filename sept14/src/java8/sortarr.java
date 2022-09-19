package java8;
import java.util.Arrays;

public class sortarr {
 
    public static void main(String[] args) {
        int arr[] = { 10,24,59,13,30,5 };
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        
    }
}