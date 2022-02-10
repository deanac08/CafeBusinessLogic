import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){

        int sum = 0; // variable that holds our total
        int i = 0; // starting variable 
        int week = numWeeks; 
        while(i <= week){
            sum += i;
            i++;
        }
        return sum; // return our sum 
        }


    public double getOrderTotal(double[] prices){

        double sum = 0; 
        for(int i = 0; i< prices.length; i++){  // use .length for arrays and .size for arrayLists
            sum += prices[i];
        }
        return sum; // return our sum
    }


    public void displayMenu(ArrayList<String> menuItems){
        System.out.println(menuItems);
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));  // use .get to 
        }
    }



    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName=System.console().readLine();
        System.out.printf("Hello, %s !", userName); 
        System.out.printf("There are %s people in front of you", customers.size()); 
        customers.add(userName); // this is to add the new userName to the ArrayList
    }
}

