package initializations;

import lombok.val;

public class SomeExample {

    private static int ONE = one();
    int b;

    protected final int c = two();

    /*
        Initialize class members
            * static initialization blocks
            * static private initialization blocks
     */

    // static initialization blocks
    static {
        System.out.println("A Static Initialization Blocks");
    }

    static {
        System.out.println("Another Static Initialization Blocks");
    }

    // static private initialization blocks that can be reused later to initialize class variables
    private static int one() {
        System.out.println("one()");
        return 1;
    }

    /*
        Initializing instance members
            * initializer blocks
            * private final methods
     */

    // Java compiler copies initializer blocks into every constructor
    {
        System.out.println("b=3");
        b = 3;
        print();
    }

    // final methods
    // they cannot be overridden in a subclass
    protected final int two() {
        System.out.println("two()");
        return 2;
    }

    void print() {
        System.out.printf("a=%d, b=%d, c=%d%n", ONE, b, c);
    }

    public static void main(String[] args) {
        new SomeExample().print();
    }
}
