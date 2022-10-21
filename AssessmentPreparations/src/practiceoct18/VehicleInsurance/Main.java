package practiceoct18.VehicleInsurance;

public class Main {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle("KL 21 5676","K10","4 wheeler", 200000);
		System.out.println(v.issueLoan());
		System.out.println(v.takeInsurance());	
	}

}
