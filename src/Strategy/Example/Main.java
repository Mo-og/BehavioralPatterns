package Strategy.Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Integer> productCost = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();

    private static PaymentStrategy paymentStrategy;

    static {
        productCost.put(1, 200);
        productCost.put(2, 400);
        productCost.put(3, 600);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isCompleted()) {
            String continueChoice;
            do {
                System.out.println("Select a product: \n1. Product 1 \n2. Product 2 \n3. Product 3");
                System.out.println("Your choice: ");
                int productChoice = Integer.parseInt(reader.readLine());
                int cost = productCost.get(productChoice);
                System.out.println("How many? :");
                int amount = Integer.parseInt(reader.readLine());
                Order.setTotalCost(cost * amount);
                System.out.println("Continue shopping? (Y/N): ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));
            if (paymentStrategy == null) {
                System.out.println("Select payment method:\n1.Paypal\n2.QIWI");
                System.out.println("Your choice: ");
                String paymentStrategyChoice = reader.readLine();
                if (paymentStrategyChoice.equals("1")) {
                    paymentStrategy = new PayPalPayment();
                } else paymentStrategy = new QiwiPayment();
                order.processOrder(paymentStrategy);
            }
            System.out.println("Pay? (Y/N)");
            String paymentChoice = reader.readLine();
            if (paymentChoice.equalsIgnoreCase("Y")) {
                if (paymentStrategy.execute(Order.getTotalCost())){
                    System.out.println("Payment successful");
                }else System.out.println("Payment failed!");
            }
            order.setCompleted();
        }
    }
}
