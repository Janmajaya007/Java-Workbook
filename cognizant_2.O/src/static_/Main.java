package static_;
import java.util.Scanner;
class Ticket{
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	/* getter setter for ticketId */
	public int getTicketId() {
		return ticketid;
	}
	public void setTicketid(int tid){
       this.ticketid = tid;
   }
	
	/* getter setter for price */
	public int getPrice() {
		return price;
	}
	public void setPrice(int price){
       this.price = price;
   }
	
	/* getter setter for available tickets */
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int tickets){
		if (tickets > 0)
        availableTickets = tickets;
   }
	/* Ticket price calculation*/
	public int calculateTicketCost(int nooftickets) {
		Ticket.setAvailableTickets(availableTickets );
		int availableTickets = Ticket.getAvailableTickets()- nooftickets;
		if(availableTickets <=0)
		return -1;
		
		return nooftickets * getPrice();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ticket t =  new Ticket();
		System.out.println("Enter no of bookings:");
		int noOfBooking= sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		int ticketAvailable =sc.nextInt();
		Ticket.setAvailableTickets(ticketAvailable);
		
		for(int i=0; i<noOfBooking; i++) {
			
			System.out.println("Enter the ticketid:");
			int tid=sc.nextInt();
			t.setTicketid(tid);
			
			System.out.println("Enter the price:");
			int price=sc.nextInt();
			t.setPrice(price);
			
			System.out.println("Enter the no of tickets:");
			int noOfTickets =sc.nextInt();
			//t.calculateTicketCost(noOfTickets);
			
			System.out.printf("Available tickets:");
			System.out.println(Ticket.getAvailableTickets()+"");
		
			System.out.printf("Total amount:");
			System.out.println(t.calculateTicketCost(noOfTickets)+"");
			
			System.out.printf("Available ticket after booking:");
			System.out.println(Ticket.getAvailableTickets()-noOfTickets+"");
			Ticket.setAvailableTickets(Ticket.getAvailableTickets()-noOfTickets);
			
		}
	}

}
