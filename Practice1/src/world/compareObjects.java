package world;

class Employee{
	public void show() {
		int id;
		String name;
	}

	public int hashCode(int i, String string) {
		
		return 0;
	}
}





public class compareObjects {

	public static void main(String[] args) {
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	int first=emp1.hashCode(21,"Ana");
	int second=emp2.hashCode(22,"Katrii");
	
    System.out.println("Comparing two objects emp1 & emp2 "+emp1.equals(emp2));
    System.out.println("Comparing two objects emp1 & emp1 "+emp1.equals(emp1));
	}

}
