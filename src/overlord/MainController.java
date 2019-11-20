package overlord;

import data.*;
import orderMeal.Ticket;

public class MainController extends OpenPipes {
    
    public static void loadMockOrders() {
        for(int i=0;i<5;i++) {
            
            Ticket ticket = new Ticket();
            ticket.mealPeriod = "BREAKFAST";
            ticket.name = "CLAY";
            ticket.beverage = "WATER";
            Data.activeTickets.add(ticket);
        }
    }
    
    public static void main(String[] args) {
        //OrderForm order = new OrderForm();
        //order.setVisible(true);
        MainController.startTicketProcessor();
        MainController.loadMockOrders();
        
        //DataRequest request = new DataRequest();
        //request.setVisible(true);
        
        
        
    }
}