package TravelAgency;

import java.util.*;
public class UserInterface {
    
   public static void main(String args[]) {
        
    // Fill the code here
    
    Scanner sc= new Scanner(System.in);
    double comission=0.0;
    System.out.println("Enter the no of passengers");
    int n=sc.nextInt();
     
    for(int i=0; i<n;++i){
        System.out.println(String.format("Details of Passenger %d:", (i + 1)));
        System.out.println("Enter the pnr no:");
        long pnrNo = sc.nextLong();
        System.out.println("Enter passenger name:");
        String name= sc.nextLine();
        sc.nextLine();
        System.out.println("Enter seat no:");
        int seatNo =sc.nextInt();
        System.out.println("Enter class type:");
        String ClassType = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter ticket fare:");
        double ticketFare =sc.nextDouble();
        
        Ticket t =new Ticket (pnrNo,name,seatNo,ClassType,ticketFare );
        
        CommissionInfo cinfo = generateCommissionObtained();
        comission +=  cinfo.calculateCommissionAmount(t);
    }
     
    if (comission > 0) {
            System.out.println("Commission Obtained ");
            System.out.println(String.format("Commission obtained per each person: Rs.%.2f", comission));
        }
    
    sc.close();
    }
    	
public static CommissionInfo generateCommissionObtained (){
    return ticket -> ticket.getClassType().toUpperCase().matches("^(SL|2S)$") ? 60 
                        : ticket.getClassType().toUpperCase().matches("^(1A|2A|3A)$") ? 100 : 0 ;
}
}
