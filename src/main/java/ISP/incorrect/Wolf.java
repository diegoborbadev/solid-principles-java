package ISP.incorrect;

public class Wolf implements Animal {
    @Override
    public void eat() {
        // Wolves can eat
    }

    @Override
    public void run() {
        // Wolves can run
    }

    @Override
    public void hunt() {
        // Wolves can hunt
    }

    @Override
    public void giveAPaw() {
        // Wolves don't give a paw (Exception!)
        throw new UnsupportedOperationException();
    }
}