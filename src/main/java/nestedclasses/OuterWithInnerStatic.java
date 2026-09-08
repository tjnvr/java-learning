package nestedclasses;

public class OuterWithStatic {

    private int count;

    static class InnerStatic {

        void print() {
            // System.out.printf("Inner print of count: %d%n", count); // this won't compile as nested static classes cannot access enclosing class non static members
        }
    }
}
