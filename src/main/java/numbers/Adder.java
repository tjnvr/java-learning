package numbers;

import java.util.Arrays;

public class Adder {

    public static void main(String[] args) {
        Arrays.stream(args).map(Integer::valueOf).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
