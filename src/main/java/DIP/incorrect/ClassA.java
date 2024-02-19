package DIP.incorrect;

public class ClassA {
    ClassB objectB;

    public ClassA(ClassB objectB) {
        this.objectB = objectB;
    }

    public void foo() {
        // Some code
        // And then call the method of ClassB
        objectB.doSomething();
    }
}