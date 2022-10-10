package mockup;

import java.util.Scanner;

public class TicketPrice{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ticket t=new ticket();
		System.out.println("Enter the no: of bookings");
		int booked=scan.nextInt();
		System.out.println("Enter the available tickets");
		int available=scan.nextInt();
		t.setAvailableTickets(available);
		System.out.println("Enter the ticket id");
		int id=scan.nextInt();
		t.setTicketid(id);
		System.out.println("Enter the price");
		int price=scan.nextInt();
		t.setPrice(price);
         System.out.println("Enter the no: of tickets");
         int ticket=scan.nextInt();
         
         if(ticket<=available) {
        	 System.out.println("Available tickets "+t.getAvailableTickets());
        	 int amount=t.calculateTicketCost(ticket);
        	 if(amount==-1) {
        		 System.out.println("Not sufficient tickets");
        	 }
        	 else {
        		 System.out.println("Total Amount"+amount);
        		 System.out.println("Remaining available tickets :"+t.getAvailableTickets());
        	 }
         }
	}

}
