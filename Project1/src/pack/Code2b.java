package pack;
//import statement   
import java.math.BigDecimal;  

public class Code2b  
{  
//main method  
public static void main(String[] argvs)  
{  
//creating two objects of BigDecimal  
BigDecimal a1 = new BigDecimal(11);  
BigDecimal a2 = new BigDecimal(17);  

//11 / 17 = 0.6470588235294118...  
a1 = a1.divide(a2);  
System.out.println(a1.toString());  
}  
}  