package pack;
public class Code2  
{  
void divide(int a, int b)  
{  
// performing division and storing the result  
int res = a / b;  
System.out.println("Division process has been done successfully.");  
System.out.println("Result came after division is: " + res);  
}  
//main method  
public static void main(String argvs[])  
{  
//creating an object of the class ArithmeticException  
Code2 obj = new Code2();  
obj.divide(1, 0);  
}  
}  