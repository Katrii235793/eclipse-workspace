package ustdemo;

class Shape1 {
	public void print_shape() {
		System.out.println("This is shape");
	}
}

class Rectangle extends Shape1 {
	public void print_rect() {
		System.out.println("This is a rectangle shape");
	}
}

class Cicle extends Shape1 {
	public void print_circle() {
		System.out.println("This is a circle");
	}
}

class Square extends Rectangle {
	public void print_square() {
		System.out.println("Square is a rectangle");
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		sq.print_shape();
		sq.print_rect();
	}

}
