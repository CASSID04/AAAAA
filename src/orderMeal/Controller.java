package orderMeal;

import data.Data;
import data.DateTime;

public class Controller {
    String currentMealPeriod;
    
    public Controller() {
    }
    
    public void orderMeal(String[] setMealData) {
        //Ticket ticket = new Ticket(setMealData);
        Data.activeTickets.add(new Ticket(setMealData));
    }

    public static void viewActiveOrders() {
        for(int i=0;i<Data.activeTickets.size();i++) {
            System.out.println(Data.activeTickets.get(i).countCurrent);
            System.out.println(Data.activeTickets.get(i).mealPeriod);
            System.out.println(Data.activeTickets.get(i).name);
            System.out.println(Data.activeTickets.get(i).beverage);
            System.out.println(Data.activeTickets.get(i).entree);
            System.out.println(Data.activeTickets.get(i).side);
            System.out.println(Data.activeTickets.get(i).day);
            System.out.println(Data.activeTickets.get(i).month);
            System.out.println(Data.activeTickets.get(i).year);
            System.out.println("----------");
        }
    }
    
    public static void order(String[] formData) {
        Controller control = new Controller();

        
        String[] getMealData1 = {DateTime.mealPeriod,formData[0],formData[1],formData[2],formData[3],
            Integer.toString(DateTime.date[0]),Integer.toString(DateTime.date[1]),Integer.toString(DateTime.date[2])};
            control.orderMeal(getMealData1);   

    }
    
}