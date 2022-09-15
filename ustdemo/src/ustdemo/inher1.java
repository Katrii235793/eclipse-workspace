package ustdemo;

class parent {
	void childme() {
		System.out.println("This is Parent Class");

	}

}

class Child extends parent {
	@Override
	void childme() {
		System.out.println("This is Child Class");
	}
}

public class inher1 {
	public static void main(String[] args) {
		parent m = new parent();
		Child n = new Child();
		parent o = new Child();

		m.childme();
		n.childme();
		o.childme();
	}
}