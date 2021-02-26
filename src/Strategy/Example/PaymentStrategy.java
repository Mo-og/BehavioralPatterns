package Strategy.Example;

public interface PaymentStrategy {
    void checkUserAuthentication();
    boolean execute(int cost);
}
