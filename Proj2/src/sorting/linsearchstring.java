package sorting;
//import java.io.*;
class linsearchstring{
public static void main(String[] args) {
	// TODO Auto-//generated method stub
	char [] a= {'a','c','e','g','i','k','m'};
	char n='e';
	char temp='z';
	for(int i=0;i<a.length;i++)
	{
		if (a[i]==n)
		{
			System.out.println("The String '"+n+"' found at position "+(i+1));
			temp='a';
		}
	}
	if(temp=='z')
	{
		System.out.println("The number not Found");
	}

}

}
