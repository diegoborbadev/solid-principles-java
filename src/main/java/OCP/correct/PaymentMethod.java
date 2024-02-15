package OCP.correct;

public interface PaymentMethod {
    public void pay(double amount);
    public boolean validate();
}