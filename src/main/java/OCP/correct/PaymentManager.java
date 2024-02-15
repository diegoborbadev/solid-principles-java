package OCP.correct;

public class PaymentManager {
    public void pay(PaymentMethod paymentMethod, double amount) {
        if(paymentMethod.validate()) {
            paymentMethod.pay(amount);
            // Send a confirmation email (Example)
        } else {
           // Handle the validation error
        }
    }
}