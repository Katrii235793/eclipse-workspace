package home;
class Parent{
	public void show() {
		
	
	System.out.println("This is a parent class");
	}
}
class Child extends Parent{
	public void display() {
	System.out.println("This is a child class");
}
}
public class chipar {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Parent();
Child c=new Child();
p.show();
c.display();
c.show();

	}

}
