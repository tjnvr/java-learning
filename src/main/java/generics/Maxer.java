package generics;

import java.util.Collections;
import java.util.List;

public class Maxer {

    <T extends Comparable<? super T>> T getMax(List<? extends T> elems, int fromIndex, int toIndex) {
        return Collections.max(elems.subList(fromIndex, toIndex));
    }
}
