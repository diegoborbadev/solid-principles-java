package DIP.correct;

public class ClassA {
    InterfaceB objectB;

    public ClassA(InterfaceB objectB) {
        this.objectB = objectB;
    }

    public void foo() {
        // Some code
        // And then call the method of InterfaceB
        objectB.doSomething();
    }
}