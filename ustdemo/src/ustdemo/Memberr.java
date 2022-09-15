package ustdemo;

class Member {

	String name;
	int age;
	int pno;
	String addr;
	int sal;

	void printSalary() {
		System.out.println(sal);
	}

	void show() {
		System.out.println(name + " " + age + " " + pno + " " + addr + " " + sal + " ");
	}

}

class EmployeeA extends Member {

	String spec;

}

class Manage extends Member {

	String dept;

}

public class Memberr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeA e = new EmployeeA();
		e.name = "abc";
		e.age = 18;
		e.pno = 221223131;
		e.addr = "abcssjcsj";
		e.sal = 12000;
		e.show();

		Manage m = new Manage();
		m.name = "abac";
		m.age = 19;
		m.pno = 22122131;
		m.addr = "abssjcsj";
		m.sal = 1200;
		m.show();

	}

}