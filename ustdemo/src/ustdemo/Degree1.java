package ustdemo;

class Degree {
	public void getDegree() {
		System.out.println("I got a degree.");
	}
}

class Undergraduate extends Degree {
	@Override
	public void getDegree() {
		System.out.println("I am an undergraduate");
	}
}

class postgraduate extends Degree {
	@Override
	public void getDegree() {
		System.out.println("I am a post graduate");

	}
}

public class Degree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate obj = new Undergraduate();
		postgraduate obj1 = new postgraduate();
		obj.getDegree();
		obj1.getDegree();

	}

}
