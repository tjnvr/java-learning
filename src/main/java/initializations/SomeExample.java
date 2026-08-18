package initializations;

import lombok.val;

public class SomeExample {

    int a = one();
    int b;

    {
        this.a = 2;
        this.b = 3;
        System.out.printf("a=%d, b=%d%n", this.a, this.b);
        System.out.println("SomeExample Initializer Block");
    }

    static {
        System.out.println("A Static Initialization Blocks");
    }

    static {
        System.out.println("Another Static Initialization Blocks");
    }

    private static int one() {
        System.out.println("one()");
        return 1;
    }

    public static void main(String[] args) {
        val ex = new SomeExample();
        System.out.printf("a=%d, b=%d%n", ex.a, ex.b);
    }
}
