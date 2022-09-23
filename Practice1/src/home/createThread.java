package home;
import java.io.*;
import java.util.Scanner;

//import sept15.thread;

class Donkey extends Thread{
	public void display() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a token");
		int num=scan.nextInt();
		if(num==1) {
		System.out.println("Donkey is used for carrying load");
		}
		else {
			System.out.println("Donkey is a fool");
		}		
	}
	
}
public class createThread {

	public static void main(String[] args) {
	Donkey d=new Donkey();
	Thread t1=new Thread(d);
	try {
		t1.sleep(0);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	}

}
