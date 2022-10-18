package mockup;
import java.util.*;
class factorial{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int fact=1;
if(n==0||n==1) {
	System.out.println("1 is the factorial");
}
else {
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("The factorial is "+fact);
}

}
}
