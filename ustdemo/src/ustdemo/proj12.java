package ustdemo;

//import java.io.*;
class Parent1 {
	static void print() {
		System.out.println("This is parent class");
	}

}

class chil extends Parent1 {
	static void print() {
		System.out.println("This is child class");

	}
}

public class proj12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 obj1 = new Parent1();
		chil obj2 = new chil();
		Parent1 obj3 = new chil();
		Parent1.print();
		chil.print();
		Parent1.print();

	}

}
