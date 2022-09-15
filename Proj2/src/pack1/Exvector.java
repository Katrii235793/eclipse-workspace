package pack1;
import java.io.*;
import java.util.Vector;
import java.util.Iterator;
public class Exvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> obj=new Vector<String>();
obj.add("I");
obj.add("LOVE");
obj.add("UST");
Iterator it=obj.iterator();
while(it.hasNext())
	System.out.print(it.next()+" ");

	}

}
