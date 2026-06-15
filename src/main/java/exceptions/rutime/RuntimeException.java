package exceptions.rutime;

import lombok.val;

public class RuntimeException {
    static void main() {
        try {
            val unused = willFail3();
        } catch (Exception e) {
            System.out.printf("Something bad happened: %s\n", e.getMessage());
            throw e;
        }
    }

    static int willFail3() {
        return willFail2();
    }

    static int willFail2() {
        return willFail();
    }

    // RuntimeExceptions are due to programming errors, they are 'unchecked' : not indicated in the methods signature
    static int willFail() {
        return 10 / 0; // cause ArithmeticException
    }
}
