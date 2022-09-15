package ustdemo;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj1 = new File("example.txt");
		try {
			boolean success = obj1.createNewFile();
			if (success) {
				System.out.println("File got created");
			} else {
				System.out.println("File already exists");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
