package LSP.incorrect;

public class Penguin implements Bird {
    @Override
    public void fly() {
        // Penguin can't fly (Exception!)
        throw new UnsupportedOperationException();
    }

    @Override
    public void peck() {
        // Penguin pecks
    }
}