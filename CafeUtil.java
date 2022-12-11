import java.util.ArrayList;

public class CafeUtil {

    public String getStreakGoal(int numWeeks){
        int i;
        int sum = 0;
        for(i=1; i<=numWeeks; i++){
            sum = sum + i;
        }
        return "Purchases needed by week " + numWeeks + ": " + sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        for (int i = 1; i < maxQuantity +1 ; i++) {
            System.out.println(product + " " + i + "-" + "$" + (price * i));
        }

    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " -- " + prices.get(i));
        }
        return true;
    }
    
}
