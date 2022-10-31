package Testing.spring3ioc;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Default constructor");
	}
	public Employee(int id) {
		this.id=id;
	}
	
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public void show() {
		System.out.print("Employee id "+id+" is"+name+" .");
	}
	

}
