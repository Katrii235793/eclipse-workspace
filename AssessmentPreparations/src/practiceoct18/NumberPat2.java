package practiceoct18;
import java.util.Scanner;

public class NumberPat2
{
    public static void main(String[] args)
    {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
