package ustdemo;

class PrinA {
	void printn(int a, char c) {
		System.out.println(a + " " + c);
	}

	void printn(char c, int a) {
		System.out.println(c + " " + a);
	}

}

public class Prin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrinA pn = new PrinA();
		pn.printn(5, 'a');
		pn.printn('a', 5);

	}

}
