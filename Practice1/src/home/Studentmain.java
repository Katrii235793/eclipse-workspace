package home;
import java.util.ArrayList;
import java.util.List;
class Student{
	String name;
	int age;
	String addr;
	
public Student(){
		name="unknown";
		age=0;
		addr="not available";
	}
void setinfo(int age, String name) {
	name="Katrii";
	age=22;
}

void setinfo(int age, String name,String addr) {
	name="Katrii";
	age=22;
	addr="XYZ,ABCD Lane";
}
}

public class Studentmain {

	public static void main(String[] args) {
		//int arr[];
		//arr=new int[10];
		//for(int i=0;i<arr.length;i++)
			List<Student> stu=new ArrayList<>();

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());

		stu.add(new Student());
		stu.get(0).setinfo(55, "Name1");

		stu.get(2).setinfo(50, "Name3","Bombay,India");

		stu.get(3).setinfo(45, "Name4","Bhopal,India");

		stu.get(5).setinfo(30, "Name6","Pune,India");

		stu.get(6).setinfo(65, "Name7","Delhi,India");

		stu.get(8).setinfo(55, "Name9");

		for(Student s :stu)

		{

		System.out.println(s);

		}

		}

		
		
	}


