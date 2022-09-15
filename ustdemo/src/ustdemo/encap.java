package ustdemo;

class encap1 {
	private int roll;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap1 e = new encap1();
		e.setName("Katrii");
		e.setRoll(8);
		System.out.println(e.getName());
		System.out.println(e.getName());
	}

}
