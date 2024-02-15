package OCP.incorrect;

public class PaymentManager {

    private boolean bitcoin;
    private boolean card;

    public void pay(double amount) {
        if(isCard()) {
            if (validateCard()) {
                // Payment Logic
            }
        } else if(isBitcoin()) {
            if (validateBitcoin()) {
                // Payment Logic
            }
        }
    }

    private Boolean validateCard() {
        // Validation Logic
        return true;
    }

    private Boolean validateBitcoin() {
        // Validation Logic
        return true;
    }

    public boolean isBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(boolean bitcoin) {
        this.bitcoin = bitcoin;
    }

    public boolean isCard() {
        return card;
    }

    public void setCard(boolean card) {
        this.card = card;
    }
}