package ExamWed;

class Bank{
	public void getBalance() {
		
	}
}

class BankA extends Bank{
	public void getBalance() {
		System.out.println("$100 deposited in Bank A");
	}
}
class BankB extends Bank{
	public void getBalance() {
		System.out.println("$150 deposited in Bank B");
	}
}

class BankC extends Bank{
	public void getBalance() {
		System.out.println("$200 deposited in Bank C");
	}
}
public class bankMain {

	public static void main(String[] args) {
	
		Bank b=new Bank();
		BankA b1=new BankA();
		BankB b2=new BankB();
		BankC b3=new BankC();
		
		b.getBalance();
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
		
		
	}

}
