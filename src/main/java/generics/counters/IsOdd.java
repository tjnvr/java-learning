package generics.counters;

import java.util.function.Predicate;

public class IsOdd implements Predicate<Integer> {

    public boolean test(Integer i) {
        return i % 2 == 1;
    }
}
