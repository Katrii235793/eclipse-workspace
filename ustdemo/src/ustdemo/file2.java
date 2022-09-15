package ustdemo;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			FileWriter obj2 = new FileWriter("example.txt");
			obj2.write("Hello");
			obj2.write("Welcome to the Java course");
			obj2.close();
			
			FileReader objz=new FileReader("example.txt");
			Scanner scan=new Scanner(objz);
			while(scan.hasNextLine()) {
				String data=scan.nextLine();
				System.out.println(data);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
