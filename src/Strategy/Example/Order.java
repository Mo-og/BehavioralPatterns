package Strategy.Example;

public class Order {
    private static int totalCost=0;
    private boolean isCompleted=false;
    public void processOrder(PaymentStrategy strategy){
        strategy.checkUserAuthentication();
    }
    public static int getTotalCost(){
        return totalCost;
    }

    public static void setTotalCost(int totalCost) {
        Order.totalCost = totalCost;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted() {
        isCompleted = true;
    }
}
