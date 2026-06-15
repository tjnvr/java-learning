package exceptions.custom;

public class Divider {

    static int divide(int a, int b) throws MyCustomException {
        if (b == 0) {
            throw new MyCustomException("division by zero");
        }
        return a / b;
    }
}
