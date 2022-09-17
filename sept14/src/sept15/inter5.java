package sept15;
interface sh{
	void s();
	static int printable(int a)
	{
		return a*a;
	}
}
class b implements sh{
	public void s()
	{
		System.out.println("Hello");
	}
}
public class inter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b a=new b();
		a.s();
		System.out.println(sh.printable(4));

	}

}