package ustdemo;

public class patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++)
			if (i == 3) {
				System.out.print((i + 1) + " " + (i + 1));
				i++;
				System.out.println();

			} else {
				System.out.print((i) + " " + (i + 1));
				System.out.println();
			}
	}

}
