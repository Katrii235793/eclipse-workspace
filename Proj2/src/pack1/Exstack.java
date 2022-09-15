package pack1;
import java.util.*;
import java.util.ListIterator;
public class Exstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack<Integer>();
st.push(11);
st.push(22);
st.push(33);
st.push(44);
st.push(55);
System.out.print("Stack : ");
Iterator it=st.iterator();
while(it.hasNext())
		System.out.print(it.next()+" ");
st.pop();
System.out.print("\nStack after pop : ");
Iterator it1=st.iterator();
while(it1.hasNext())
		System.out.print(it1.next()+" ");

	}

}

