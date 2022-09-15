package ustdemo;

class Print1 {
	void printn(int a, char ch) {
		System.out.println("Integer=" + a + "," + "Character=" + ch);
	}

	void printn(char ch, int a) {
		System.out.println("Character=" + ch + "," + "Integer=" + a);
	}

}

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj = new Print();
		obj.printn(1, 'a');
		obj.printn('b', 2);
	}

	private void printn(char i, int j) {
		// TODO Auto-generated method stub

	}

	public void printn(int i, char c) {
		// TODO Auto-generated method stub

	}

}
