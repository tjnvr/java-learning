package generics;

import java.util.Collection;
import java.util.function.Predicate;

public class Counter {
    <T> long countIf(Collection<T> elems, Predicate<T> pred) {
        return elems.stream().filter(pred).count();
    }
}
