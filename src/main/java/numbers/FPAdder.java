package numbers;

import java.util.Arrays;
import java.util.Locale;

public class FPAdder {

    public static void main(String[] args) {
        Arrays.stream(args).map(Float::valueOf).reduce(Float::sum).ifPresent(v -> System.out.format(Locale.FRANCE, "%.2f", v));
    }
}
