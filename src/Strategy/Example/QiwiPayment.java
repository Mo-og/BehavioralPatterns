package Strategy.Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class QiwiPayment implements PaymentStrategy {
    private static final Map<String, String> DATABASE = new HashMap<>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String phone, password;
    private boolean signedIn;

    static {
        DATABASE.put("test", "1122334455");
    }

    private boolean authenticate() {
        setSignedIn(phone.equals(DATABASE.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public void checkUserAuthentication() {
        try {
            while (!signedIn) {
                System.out.println("---QIWI---");
                System.out.println("Enter phone number: ");
                phone =reader.readLine();

                System.out.println("Enter password: ");
                password=reader.readLine();
                if (authenticate()){
                    System.out.println("Authentication is successful!");
                }else System.out.println("Authentication failed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean execute(int cost) {
        if (signedIn) {
            System.out.println("Paying " + cost + " using QIWI.");
            return true;
        } else return false;
    }
}
