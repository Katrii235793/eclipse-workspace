package ustdemo;

public class primehund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100, c;
		for (int i = 1; i <= num; i++) {
			c = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					c++;
					break;

				}
			}
			if (c == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
