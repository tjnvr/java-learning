package exceptions.custom;

import lombok.val;

public class Main {
    static void main() {
        try {
            val a = 10;
            val b = 0;
            val result = Divider.divide(a, b);
            System.out.printf("%d/%d=%d\n", a, b, result);
        } catch (MyCustomException e) {
            System.out.printf("Divided failed: %s\n", e.getMessage());
        }
    }
}
