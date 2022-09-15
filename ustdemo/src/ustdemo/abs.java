package ustdemo;

abstract class C {
	public void a() {
		System.out.println("abc");

	}

	public abstract void b();

	public abstract void c();
}

abstract class D extends C {
	@Override
	public void b() {
		System.out.println("bcd");
	}
}

class E extends D {
	@Override
	public void c() {
		System.out.println("cde");
	}
}

public class abs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D cc = new E();
		cc.a();
		cc.b();
		cc.c();
	}

}
