package orderMeal;

import java.util.ArrayList;

public class Ticket {
    public static int countOverall = 0;
    public int countCurrent;
    public String mealPeriod;
    public String name;
    public String beverage;
    public String entree;
    public String side;
    public String day;
    public String month;
    public String year;
    
    public Ticket(String[] ticketData) {
        countOverall++;
        countCurrent = countOverall;
        mealPeriod = ticketData[0];
        name = ticketData[1];
        beverage = ticketData[2];
        entree = ticketData[3];
        side = ticketData[4];
        day = ticketData[5];
        month = ticketData[6];
        year = ticketData[7];
    }
    
    public Ticket() {  
    }
    
    public Ticket(int numRandomOrders,int[] date) {
        ArrayList<Ticket> randomBatch = new ArrayList<Ticket>();
        for(int i=0;i<numRandomOrders;i++) {
            this.day = Integer.toString(date[0]);
            this.month = Integer.toString(date[1]);
            this.year = Integer.toString(date[2]);
        }
    }
    
}