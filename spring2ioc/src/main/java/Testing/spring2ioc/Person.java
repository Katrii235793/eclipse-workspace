package Testing.spring2ioc;

public class Person {
	private String name;
	private String department;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void display() {
		System.out.println("I am  "+name+ " from "+department);
	}
}
