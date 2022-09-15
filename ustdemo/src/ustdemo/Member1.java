package ustdemo;

public class Member1 {
	String name;
	int age;
	String number;
	String addr;
	int salary;

	public void printSalary() {
		System.out.println(salary);
	}
}

class Employee extends Member1 {
	String domain;
}

class Manager extends Member1 {
	String dept;

	public class Member {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee e = new Employee();
			e.name = "Ria";
			e.age = 22;
			e.number = "8156922523";
			e.addr = "home";
			e.salary = 23456;
			e.domain = "java";

			Manager m = new Manager();
		}
	}
}
